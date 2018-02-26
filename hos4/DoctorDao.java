package Hospital;

import java.io.FileNotFoundException;

public interface DoctorDao {
	
	//void setPrescription(Doctor d);

	void addDoctor(Doctor d);
	
	void updateDoctor(Doctor d);

	boolean checkAvailibilty();
	
//	boolean checkAvailibilty();
	

}
