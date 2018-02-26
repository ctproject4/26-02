
package Hospital;
import java.util.Scanner;



public class LogIn {
	
	
	boolean checkstatus;
	
//	String usrname,pswd;
	
	Scanner sc = new Scanner(System.in);

	
	boolean userLogin(String usrname,String pswd )
	{
				
		

		User u = new User();
		u.setId(usrname);
		u.setPassword(pswd);
		
		LoginImpl li = new LoginImpl();
		checkstatus = li.checkUser(u);
	
		return checkstatus;
		
	}
	
	
	
	
	
	
	
	boolean adminLogin(String usrname,String pswd){
		
		
		Admin a = new Admin();
		a.setId(usrname);
		a.setPassword(pswd);
		
		LoginImpl li = new LoginImpl();
		checkstatus = li.checkAdmin(a);
	
		return checkstatus;
	
	}
	
	
	
	
	
	
	boolean doctorLogin(String usrname,String pswd){
		
				Doctor d = new Doctor();
				d.setId(usrname);
				d.setPassword(pswd);
				
				LoginImpl li = new LoginImpl();
				checkstatus = li.checkDoctor(d);
			
				return checkstatus;
	}
	
	boolean pharmasistLogin(String usrname,String pswd){

		Pharmacist p = new Pharmacist();
		p.setId(usrname);
		p.setPassword(pswd);
		
		LoginImpl li = new LoginImpl();
		checkstatus = li.checkPharmacist(p);
	
		return checkstatus;
	}

	
	void guestLogin(){
		int n;
		System.out.println("Enter Your Choice");
		System.out.println("Press 1 to Create Account");
		System.out.println("Press 2 For Hospital Details");
		System.out.println("Press 3 To Exit!");
		n=sc.nextInt();
		
			switch(n)
			{
				case 1:
					new GuestService().createAccount();
					break;
				case 2:
					System.out.println("CITIUSTECH HOSPITAL");
					break;
				
				default:
					Exception1.inValidOption();
						
		}
		
	}

}
