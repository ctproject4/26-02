package Hospital;

import java.util.Scanner;

public class PharmasistOps {

	
	static int choice = 0;
	
	private PharmasistOps()
	{
		
	}
	static PharmasistService pharmasistservice = new PharmasistService();
	public static void pharmasistoperations()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Welcome..");
		System.out.println("You can perform the following operations:- ");
		System.out.println("Press 1 to Provide Medicine");
		System.out.println("Press 2 to Generate Medicine Bill");
		System.out.println("Press 3 to Add Medicine");
		System.out.println("Press 4 to Remove Medicine");
		System.out.println("Press 5 to exit Pharmacist Operations");
		
		
		choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			pharmasistservice.provideMed();
			break;
		case 2:
			pharmasistservice.generateMedBill();
			break;
		case 3:
			pharmasistservice.addMedicine();
			break;
		case 4:
			pharmasistservice.removeMedicine();
			break;
		default:
		
			Exception1.inValidOption();
				}
		
		}while(choice!=5);  
		
	}
}




