package Hospital;

import java.util.Scanner;

public class GuestService 
{
	Guest g = new Guest();
	GuestDao gd = new GuestImpl();
	String id,password,age,name,gender,ICDcode;
	
	
	Scanner sc = new Scanner(System.in);

	public void createAccount()
	{
		System.out.println("Enter desired Id: ");
		id = sc.next();
		System.out.println("Enter desired password: ");
		password = sc.next();
		
		System.out.println("Enter Name: ");
		name = sc.next();
		
		System.out.println("Enter age: ");
		age = sc.next();
		System.out.println("Enter gender: ");
		gender = sc.next();
		
		System.out.println("Enter ICD code: ");
		ICDcode = sc.next();
		
		
		g.setId(id);
		g.setPassword(password);
		g.setGender(gender);
		g.setName(name);
		g.setAge(age);
		g.setIcdCode(ICDcode);
		
		gd.addGuest(g);		
	}
	void hospitalDetails()
	{
		System.out.println("CITIUSTECH HOSPITAL");
		System.out.println("AIROLI");
		System.out.println("MINDSPACE");
	}
}
