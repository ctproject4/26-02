package Hospital;



public interface LoginDao {

	boolean checkAdmin(Admin a);
	boolean checkDoctor(Doctor d);
	boolean checkUser(User u);
	boolean checkPharmacist(Pharmacist p);
}
