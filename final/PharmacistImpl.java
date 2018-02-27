package Hospital;

import java.sql.Connection;

public class PharmacistImpl implements PharmacistDao {

	
	


	public void addMedicine(Pharmacist p) 
	{
		//System.out.println("Medicine Added : "+p.getName());
		
	}

	
	public void addPharmacist(Pharmacist p) 
	{
		

		

		HospitalInsert hospitalinsert=new HospitalInsert();
		
		
		try {
			int f1=0,f2=0;
			Connection con=ConnectionProvider.provideConnection();
			con.setAutoCommit(false);
			if(hospitalinsert.insert("pharmacist",p.getId(),p.getName(),p.getCompany()))
			{
				f1=1;
			}
			if(hospitalinsert.insert("login",p.getId(),p.getPassword(),"pharmacist")){
				f2=1;
			}
			if(f1==1 && f2==1)
			{
				con.commit();
			}
			else
				con.rollback();
			
		} catch (Exception e) {
			
			Exception1.inValidEntry();
		}
	
		
	}


	public void updatePharmacist(Pharmacist p) 
	{
		

		
		HospitalUpdate hu = new HospitalUpdate();
		
		try {
			int f1=0,f2=0;
			Connection con=ConnectionProvider.provideConnection();
			con.setAutoCommit(false);
			if(hu.update("pharmacist",p.getName(),p.getCompany(),p.getId()))
			{
				f1=1;
			}
			if(hu.update("login",p.getPassword(),p.getId())){
				f2=1;
			}
			if(f1==1 && f2==1)
			{
				con.commit();
			}
			else
				con.rollback();
			
		} catch (Exception e) {
			
			Exception1.inValidUpdate();
		}

		
	
		
	}

	
	

}
