package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PharmasistService {
	
	 String userid,medid;
	    Scanner sc = new Scanner(System.in);
	    String sql;

	Pharmacist p = new Pharmacist();
	PharmacistDao pd = new PharmacistImpl();
	Connection con=	ConnectionProvider.provideConnection();
	PreparedStatement pst;
	ResultSet rs;
	
	public void generateMedBill()
	{
		
		System.out.println("Enter Patient id for medicine bill generation: ");
		userid = sc.next();
		
		sql="SELECT sum(Price) FROM medicine where M_id in (select M_id from usermed where U_id=?)";
		//sql="select * from login where id=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, userid);
			rs=pst.executeQuery();
			
			while (rs.next())
			 {
				 System.out.print("Total payable Amount is Rs. ");
				 System.err.print(rs.getInt(1)+".00\n");
				
			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		
	}
	public void addMedicine(){	
		 
		int quant;
			System.out.println("Enter Patient id: ");
			userid = sc.next();
			System.out.println("Number of medicines: ");
			quant=sc.nextInt();
			
			
			for(int i=0;i<quant;i++)
			{
				System.out.println("Enter Medicine id: ");
				medid = sc.next();
				
				
				boolean result=false;
				sql ="insert into usermed values (?,?)" ;
				try {
					
					pst=con.prepareStatement(sql);
					pst.setString(1, userid);
					pst.setString(2, medid);
					pst.executeUpdate();
				} catch (SQLException e) {
					
				}
				
			}
			
			
			
			
	/*		p.setName(userid);
			p.setCompany();
		//	p.setPrice(price);
					
			
			pd.addMedicine(p);	*/	
			}
	
	
	public void removeMedicine(){
		System.out.println("Medicine Removed");
	}
}
