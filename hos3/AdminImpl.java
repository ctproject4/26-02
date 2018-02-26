package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminImpl implements AdminDao {

	
	boolean status = false;


	public boolean checkAdmin(Admin a)
	{
		
		
			Connection conn;
			try {
				conn = ConnectionProvider.provideConnection();
				PreparedStatement  pst =conn.prepareStatement("select * from login where Id=? and password=?");
				pst.setString(1,a.getId());
				pst.setString(2,a.getPassword());
				
				ResultSet  rs  = pst.executeQuery();
				if(rs.next())
					status =true;
				
					
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return status;
			
		
		
	}

	
	
	
	
	public void addDoctor(Admin a) 
	{
		
		
		/*
		try 
		{
			Connection conn= ConnectionProvider.provideConnection();
			PreparedStatement  pst =conn.prepareStatement("select * from login where id=? and password=?");
			
			pst.setString(1,id);
			pst.setString(2, password);
			
			ResultSet  rs  = pst.executeQuery();
			if(rs.next())
				status =true;
			
			return status;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	//	System.out.println("Doctor Added : "+a.getName());
	 * 
	 * */
	 
		
	}
	
	
	

}
