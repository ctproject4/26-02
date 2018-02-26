package Hospital;

import java.util.Scanner;

public class AdminService {

	Doctor d = new Doctor();
	DoctorDao dd = new DoctorImpl();
	
	Pharmacist p = new Pharmacist();
	PharmacistDao pd = new PharmacistImpl();
	
	Scanner sc = new Scanner(System.in);

	
	public void addDoctor()
	{
		
		String name,id,pswd,age,spec,gender;
		
			System.out.println("Enter Id: ");
			id = sc.next();
			
			System.out.println("Enter password: ");
			pswd = sc.next();
			
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter age: ");
			age = sc.next();
			System.out.println("Enter Specilization: ");
			spec = sc.next();
			System.out.println("Enter gender: ");
			gender = sc.next();
			
			
		
			d.setId(id);
			d.setAge(age);
			d.setPassword(pswd);
			d.setGender(gender);
			d.setName(name);
			d.setSpec(spec);
			
			dd.addDoctor(d);	
		
		}
	

	/*
	
	public void updatePatient(){
		System.out.println("Patient Updated");
	}
	public void checkAvailability(){
		System.out.println("Availability Checked");
	}
	public void generateBill(){
		System.out.println("Bill Generated");
	}
	
	*/
	
	
	public void updateDoctor()
	{
		

		
		String name,id,pswd,age,spec,gender,id1;
		
		System.out.println("Enter Id of the Doctor whose properties have to be updated ");
		id1 = sc.next();
		
		System.out.println("Start updating the values:- ");
			System.out.println("Enter Id: ");
			id = sc.next();
			
			System.out.println("Enter password: ");
			pswd = sc.next();
			
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter age: ");
			age = sc.next();
			System.out.println("Enter Specilization: ");
			spec = sc.next();
			System.out.println("Enter gender: ");
			gender = sc.next();
			
			
			d.setId1(id1);
			
			d.setId(id);
			d.setAge(age);
			d.setPassword(pswd);
			d.setGender(gender);
			d.setName(name);
			d.setSpec(spec);
			
			dd.updateDoctor(d);	
		
		
		
	}
	
	
	public void addPharmacist()
	{
		
		String name,id,pswd,C_name,id1;
		
		System.out.println("Enter Id of the Doctor whose properties have to be updated ");
		id1 = sc.next();
		
		System.out.println("Start updating the values:- ");
		
			System.out.println("Enter Id: ");
			id = sc.next();
			
			System.out.println("Enter password: ");
			pswd = sc.next();
			
			System.out.println("Enter Name: ");
			name = sc.next();
		
			System.out.println("Enter Company Name: ");
			C_name = sc.next();
			
			
			p.setId1(id1);
			p.setId(id);
			p.setPassword(pswd);
			p.setName(name);
			p.setCompany(C_name);
			
			pd.addPharmacist(p);	
		
		
	
	}
	
	
	public void updatePharmacist()
	{

		
		String name,id,pswd,C_name;
		
			System.out.println("Enter Id: ");
			id = sc.next();
			
			System.out.println("Enter password: ");
			pswd = sc.next();
			
			System.out.println("Enter Name: ");
			name = sc.next();
		
			System.out.println("Enter Company Name: ");
			C_name = sc.next();
			
			
		
			p.setId(id);
			p.setPassword(pswd);
			p.setName(name);
			p.setCompany(C_name);
			
			pd.updatePharmacist(p);	
		
		
	
	
		
	}
	
	
	
	
	
}
