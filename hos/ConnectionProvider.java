package Hospital;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Properties;

public class ConnectionProvider {
	
static Connection con=null;
	
	public static Connection provideConnection() throws Exception{
		System.out.println("1");
		String database=null,usrname=null,password=null,driver=null;
		System.out.println("2");
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		File file=new File("connec.properties");
		System.out.println("3");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("4");
		Properties prop = new Properties();
		prop.load(fis);
		driver=prop.getProperty(driver);
		database=prop.getProperty(database);
		usrname=prop.getProperty(usrname);
		password=prop.getProperty(password);
		Class.forName(driver);
		con=DriverManager.getConnection(database,usrname,password);
		return  con;
	}

}
