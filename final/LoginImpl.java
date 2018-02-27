package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginImpl implements LoginDao {

	boolean status = false;
	PreparedStatement pst=null;
	ResultSet rs;
	Connection conn;
	public boolean checkAdmin(Admin a)
	{
		
		
			try {
//				status = true;
				
				conn = ConnectionProvider.provideConnection();
				
			
				pst =conn.prepareStatement("select * from login where Id=? and password=?");
			if(conn==null)
					System.out.println("NULLLL");
				pst.setString(1,a.getId());
			
				pst.setString(2,a.getPassword());
			
				rs  = pst.executeQuery();
			
				if(rs.next() && rs.getString(3).equals("admin"))
					status = true;
					
				
				
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
				if(rs.next() && rs.getString(3).equals("doctor"))
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
				if(rs.next() && rs.getString(3).equals("pharmacist"))
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
				if(rs.next() && rs.getString(3).equals("user"))
					status =true;
				
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			
			}
			
			
			return status;
			
			
	}

	
	
	

	
	

}
