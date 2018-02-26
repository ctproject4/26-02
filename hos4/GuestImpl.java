package Hospital;

import java.sql.Connection;
import java.util.Scanner;

public class GuestImpl implements GuestDao {

	
	


	public void addGuest(Guest g) 
	{
	

		
		Scanner sc = new Scanner(System.in);
		HospitalInsert hospitalinsert=new HospitalInsert();
		LogIn login = new LogIn();
	//	System.out.println(d.getId()+d.getName()+d.getAge()+d.getSpec()+d.getGender());
		
		try {
			int f1=0,f2=0;
			Connection con=ConnectionProvider.provideConnection();
			con.setAutoCommit(false);
			if(hospitalinsert.insert("user",g.getId(),g.getName(),g.getAge(),g.getGender(),g.getIcdCode()))
				f1=1;
	
			if(hospitalinsert.insert("login",g.getId(),g.getPassword(),"User")){
				f2=1;

			}
			if(f1==1 && f2==1)
			{
				con.commit();
				System.out.println("Login with newly created User Id and Password");
				System.out.println("Enter Id: ");
				String usrname=sc.next().toLowerCase();
				System.out.println("Enter password: ");
				String password=sc.next();
				if(login.userLogin(usrname,password))
				{
					UserOps.useroperations();
				}
				else
					Exception1.inValidDetails();

			}
			else
				con.rollback();
		
			
		} catch (Exception e) {
			
			Exception1.inValidEntry();
		}
	
		
	}
	
	
	

}
