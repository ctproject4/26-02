package Hospital;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserService {
	boolean status;
	PreparedStatement pst;
	ResultSet rs;
	
	Scanner sc = new Scanner(System.in);
	public void viewProfile(String id){
		Connection conn;
		try {
			conn = ConnectionProvider.provideConnection();
			pst =conn.prepareStatement("select * from login where Id=?");
			pst.setString(1, id);
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}
			catch(Exception e){}
			
			
			
//		System.out.println("See Profile");
	}
	
	public void getAppointment(){
		System.out.println("Enter id:");
		int id1=sc.nextInt();
		
		System.out.println("Enter name:");
		String nm=sc.next();
		
		  Date dNow = new Date(0);
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	}
	
	public void checkAppointmentStatus(){
		System.out.println("Appointment Status Checked");
	}
	
	
	
}
