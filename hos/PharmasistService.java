package Hospital;

import java.util.Scanner;

public class PharmasistService {
	Pharmacist p = new Pharmacist();
	PharmacistDao pd = new PharmacistImpl();
	public void provideMed(){
		System.out.println("Provided");
	}
	public void generateMedBill(){
		System.out.println("Medicine Bill");
	}
	public void addMedicine(){	
		 String name,company;
		 double price;
		
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter Company: ");
			company = sc.next();
			System.out.println("Enter Price: ");
			price = sc.nextInt();
			
			
			
			p.setName(name);
			p.setCompany(company);
		//	p.setPrice(price);
					
			
			pd.addMedicine(p);		
			}
	
	
	public void removeMedicine(){
		System.out.println("Medicine Removed");
	}
}
