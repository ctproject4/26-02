package Hospital;
import java.util.Scanner;

public class UserOps {
	
	static int choice = 0;
	
	private UserOps()
	{
		
	}
	
	public static void useroperations()
	{
		UserService userservice = new UserService();
		Scanner sc = new Scanner(System.in);
		
		do
		{
		System.out.println("Welcome <User>");
		System.out.println("You can perform the following operations:- ");
		System.out.println("Press 1 to See Profile");
		System.out.println("Press 2 to Get Appointment");
		System.out.println("Press 3 to Check Appointment Status");
		System.out.println("Press 4 to exit user operations");

		
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Id:");
			userservice.viewProfile(sc.next());
			break;
		}
		case 2:
			userservice.getAppointment();
			break;
		case 3:
			userservice.checkAppointmentStatus();
			break;
			
			default:
		Exception1.inValidOption();
			
		}
		
		}while(choice!=6);  
		
	}

}
