package Hospital;

import java.util.Scanner;

public class DoctorService {

	DoctorDao dd = new DoctorImpl();
	Doctor d = new Doctor();
	public void checkPatient(){
		System.out.println("Checked");
	}
	public void setPrescription(){
		/*String name;
		int dosage,duration;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter Dosage: ");
			dosage = sc.nextInt();
			System.out.println("Enter Duration: ");
			duration = sc.nextInt();
			
			
			
			d.setName(name);
			d.setDosage(dosage);
			d.setDuration(duration);
			
			
			dd.setPrescription(d);*/
		System.out.println("Pres");
	}
	public void labTest(){
		System.out.println("Lab test");
	}
	
}
