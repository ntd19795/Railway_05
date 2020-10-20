package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class JdbcUtils {
	private Connection connection;


	
	
	
	
	
	throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{

	Properties properties = new Properties();
	properties.load(new FileInputStream(
			"C:\\Users\\ckery\\eclipse-workspace\\MavenProject\\src\\main\\resource\\database.properties"));
	
	// step 2: get a connection to database

			String url = properties.getProperty("url2");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			// register driver class with drivermanager
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, username, password);
}



}
