package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HospitalUpdate {
	
//	Exception1 e1=new Exception1();

	
	//update for doctor table
	
	public boolean update(String tb, String param1, String param2, String param3, String param4, String param5)
	{
            
            int i=0;
            boolean result=false;
		// FOR 5 COLUMNS
            try{
		Connection con=	ConnectionProvider.provideConnection();
		PreparedStatement pst;
		//PreStatement st;
		ResultSet rs;
		
		
		
		
String sql = "update "+ tb +" set name = ?, age = ?, spec = ?, gender = ? where Id = ?";  
		pst=con.prepareStatement(sql);
		pst.setString(1, param1);
		pst.setString(2, param2);
		pst.setString(3, param3);
		pst.setString(4, param4);
		pst.setString(5, param5);

		i=pst.executeUpdate();
            }
            catch(Exception e)
            {
                Exception1.inValidEntry();
            }
		

		if(i!=0)
			result = true; 
		return result;
		
	}
	
	
	//update for pharmacist table
	
	public boolean update(String tb,String param1, String param2, String param3)
	{
                int i=0;
		boolean result=false;
		// FOR 3 COLUMNS
                try{
		Connection con=	ConnectionProvider.provideConnection();
		PreparedStatement pst;
		ResultSet rs;
		
		String sql = "update "+ tb +" set name = ?, Company = ? where Id = ?";
		pst=con.prepareStatement(sql);
		pst.setString(1, param1);
		pst.setString(2, param2);
		pst.setString(3, param3);

		i=pst.executeUpdate();
                }
                catch(Exception e)
                {
                    Exception1.inValidEntry();
                }
		if(i!=0)
			result = true; 
		return result;
	}
	
	
	//update for login table
	
	public boolean update(String tb,String param1, String param2)
	{
            
                int i=0;
		boolean result=false;
                try{
		// FOR 2 COLUMNS
		Connection con=	ConnectionProvider.provideConnection();
		PreparedStatement pst;
		ResultSet rs;
		
		String sql = "update "+ tb +" set password = ? where Id = ?";
		pst=con.prepareStatement(sql);
		pst.setString(1, param1);
		pst.setString(2, param2);

		i=pst.executeUpdate();
                }
                catch(Exception e)
                {
                    Exception1.inValidEntry();
                }
		if(i!=0)
			result = true; 
		return result;
	}



}
