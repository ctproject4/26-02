package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginImpl implements LoginDao {

	boolean status = false;
	PreparedStatement pst;
	ResultSet rs;
	public boolean checkAdmin(Admin a)
	{
			Connection conn;
			try {
				conn = ConnectionProvider.provideConnection();
				pst =conn.prepareStatement("select * from login where Id=? and password=?");
				pst.setString(1,a.getId());
				pst.setString(2,a.getPassword());
				
				rs  = pst.executeQuery();
				if(rs.next() && rs.getString(3).equals("Admin"))
					status =true;
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			
			
			return status;
			
			
	}
	public boolean checkDoctor(Doctor d)
	{
			Connection conn;
			try {
				conn = ConnectionProvider.provideConnection();
				pst =conn.prepareStatement("select * from login where Id=? and password=?");
				pst.setString(1,d.getId());
				pst.setString(2,d.getPassword());
				
				rs  = pst.executeQuery();
				if(rs.next() && rs.getString(3).equals("Doctor"))
					status =true;
				
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			
			
			return status;
			
			
	}
	public boolean checkPharmacist(Pharmacist p)
	{
			Connection conn;
			try {
				conn = ConnectionProvider.provideConnection();
				pst =conn.prepareStatement("select * from login where Id=? and password=?");
				pst.setString(1,p.getId());
				pst.setString(2,p.getPassword());
				
				rs  = pst.executeQuery();
				if(rs.next() && rs.getString(3).equals("Pharmasist"))
					status =true;
				
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			
			
			return status;
			
			
	}
	public boolean checkUser(User u)
	{
			Connection conn;
			try {
				conn = ConnectionProvider.provideConnection();
				pst =conn.prepareStatement("select * from login where Id=? and password=?");
				pst.setString(1,u.getId());
				pst.setString(2,u.getPassword());
				
				rs  = pst.executeQuery();
				if(rs.next() && rs.getString(3).equals("User"))
					status =true;
				
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			
			}
			
			
			return status;
			
			
	}

	
	
	

	
	

}
