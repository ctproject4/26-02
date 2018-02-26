package Hospital;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;

public class ConnectionProvider {
	
static Connection con=null;
	
	public static Connection provideConnection(){
		try {
			String database=null,usrname=null,password=null,driver=null;
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			File file=new File("connec.properties");
			
			FileInputStream fis = new FileInputStream(file);
			
			Properties prop = new Properties();
			
			prop.load(fis);
			driver=prop.getProperty("driver");
			database=prop.getProperty("database");
			usrname=prop.getProperty("usrname");
			password=prop.getProperty("password");
			
		
			Class.forName(driver);
			
			con=DriverManager.getConnection(database,usrname,password);

			return  con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			return null;
		} 
	}

}
