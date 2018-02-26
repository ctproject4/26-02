package Hospital;

import java.util.Scanner;

public class DoctorOps {
	
static int choice = 0;
	
	private DoctorOps()
	{
		
	}
	
	public static void doctoroperations()
	{
		DoctorService doctorservice = new DoctorService();
		Scanner sc = new Scanner(System.in);
		
		do
		{
		System.out.println("Welcome Doctor..");
		System.out.println("You can perform the following operations:- ");
		System.out.println("Press 1 Patient List");
		System.out.println("Press 2 Set Prescription");
		System.out.println("Press 3 Lab test");
		System.out.println("Press 4 to exit doctor operations  ");
		
		
		//all the sysouts
		
		System.out.println("Press 6 to exit");
		
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			doctorservice.checkPatient();
			break;
		case 2:
			doctorservice.setPrescription();
			break;
		case 3:
			doctorservice.labTest();
			break;
		case 4:
			break;
		default:
			Exception1.inValidOption();
		}
			
		
		} while(choice!=6);

	}
}
