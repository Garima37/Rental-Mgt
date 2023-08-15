import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LandlordDao
{
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	
	public LandlordDao() {
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
	
	public Landlord checkLogin(int id, String password)
	{
		Landlord l= null;
		try {
			st=con.prepareStatement("select * from landlord where landlord_id=? and password=?");
			st.setInt(1,id);
			st.setString(2, password);
		    rs=st.executeQuery();
        
		if(rs.next()) {
			l=new Landlord();
			l.setLid(rs.getInt(1));
			l.setName(rs.getString(2));
			l.setPassword(rs.getString(3));
			l.setAddress(rs.getString(4));
			l.setPhone(rs.getLong(5));
		}
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return l;
	}

	public int saveRecord(Landlord l) {
		int status=0;
		try {
			st=con.prepareStatement("insert into property values(?,?,?,?,?,?,?,?)");
			st.setInt(1,l.getLid());
			st.setString(2,l.getAptype());
			st.setString(3,l.getAmenities());
			st.setString(4, l.getFurnished());
			st.setString(5, l.getRtype());
			st.setString(6, l.getAddress());
			st.setFloat(7,l.getSdeposit());
			st.setFloat(8, l.getRent());
			
			status= st.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}

	
	
}
