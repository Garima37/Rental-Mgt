
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JTextArea;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	
	public CustomerDao()
	{
		//connect to driver class
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver found! ");
					
					 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rental","root","garimagarima");
					System.out.println("connection created");
				
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}
	
	public Customer checkLogin(int id, String password)
	{
		Customer c= null;
		try {
			st=con.prepareStatement("select * from customer where customerid=? and password=?");
			st.setInt(1,id);
			st.setString(2, password);
		    rs=st.executeQuery();
        
		if(rs.next()) 
		{
			c=new Customer();
			c.setCid(rs.getInt(1));
			c.setName(rs.getString(2));
			c.setPass(rs.getString(3));
			c.setAddress(rs.getString(4));
			c.setPhone(rs.getLong(5));
		}
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return c;
	}
	
	public int saveRecord(Customer c)
	{
		int status=0;
		try {
			st=con.prepareStatement("insert into customer(customerid, name, password, address, phone, gender) values(?,?,?,?,?,?)");
			st.setInt(1, c.getCid());
			st.setString(2, c.getName());
			st.setString(3, c.getPass());
			st.setString(4, c.getAddress());
			st.setLong(5, c.getPhone() );
			st.setString(6, c.getGender());
			
			status = st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	

	public int updatefeedback(int i, String text)
	{
		int status =0;
		try {
			st=con.prepareStatement("update customer set feedback=? where customerid=?");
			st.setString(1,text);
			st.setInt(2, i);
			status=st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	public String[][] getRecords(String aptype, String rntype, Float minrent, Float maxrent)
	{
		 
		String data[][]=null;
		try {
			CallableStatement cs= con.prepareCall("{call filterRecords(?,?,?,?)}");
			cs.setString(1, aptype);
			cs.setString(2, rntype);
			cs.setFloat(3, minrent);
			cs.setFloat(4,maxrent);
			
		rs=	cs.executeQuery();
		data= new String[10][10];
		int r=0,c;
		while(rs.next())
		{
			c=0;
			data[r][c++]=String.valueOf(rs.getInt(1)); //l_id
			data[r][c++]=rs.getString(2);  //apt type
			data[r][c++]=rs.getString(3);  //amenities
			data[r][c++]=rs.getString(4);  //furnish
			data[r][c++]=rs.getString(5);  //rental type
			data[r][c++]=rs.getString(6);  //location
			data[r][c++]=rs.getString(7);  //owner name
			data[r][c++]=String.valueOf(rs.getLong(8));  //owner phone
			data[r][c++]=String.valueOf(rs.getFloat(9));  //s_deposit
			data[r++][c]=String.valueOf(rs.getFloat(10));  //rent
				
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}

}
