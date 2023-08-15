import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PropertyDao {
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	
	public PropertyDao() {
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
	public int savePropRecord(Property p) {
		int status=0;
		try {
			st=con.prepareStatement("insert into landlord values(?,?,?,?,?)");
			st.setInt(1, p.getPid());
			st.setString(2, p.getName());
			st.setString(3,p.getPassword());
			st.setString(4,p.getAddress());
			st.setLong(5, p.getPhone());
			
			status=st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}
