package Hospital;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file=new File("connec.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			String driver=prop.getProperty("driver");
			String database=prop.getProperty("database");
			String usrname=prop.getProperty("usrname");
			String password=prop.getProperty("password");
			System.out.println(driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
