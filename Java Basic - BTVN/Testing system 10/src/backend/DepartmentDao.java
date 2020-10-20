package backend;

import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import entity.Department;

// Question2 CRUD
// Class này để cung cấp các method chuyên thao tác với table Department trong database

public class DepartmentDao {
	
public  static List<Department> getDepartments()  
		throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
{
	List<Department> departments = new ArrayList<>();
	Properties properties = new Properties();
	properties.load(new FileInputStream(
			"C:\\Users\\ckery\\eclipse-workspace\\Testing system 10\\src\\database.properties"));
	
	// step 2: get a connection to database

			String url = properties.getProperty("url2");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			// register driver class with drivermanager
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, username, password);

//	Create a statement object
	Statement statement = connection.createStatement();
	
	// execute query
	String sql = "SELECT * FROM Department";
	ResultSet resultSet = statement.executeQuery(sql);
	
//	Step 5: handling result set
	while (resultSet.next()) {
		Department department = new Department();
		department.setId(resultSet.getInt("DepartmentId"));
		department.setName(resultSet.getString("DepartmentName"));

		departments.add(department);
	}
	
	return departments;
}

public static Department getDepartmentByID(int id) throws  FileNotFoundException, ClassNotFoundException, IOException, SQLException 
{
	Properties properties = new Properties();
	properties.load(new FileInputStream(
			"C:\\Users\\ckery\\eclipse-workspace\\Testing system 10\\src\\database.properties"));
	
	// step 2: get a connection to database

			String url = properties.getProperty("url2");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			// register driver class with drivermanager
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, username, password);

//	Create a statement object
	Statement statement = connection.createStatement();
	// Create a statement object
	String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
	PreparedStatement preparedStatement = connection.prepareStatement(sql);

	// set parameter
	preparedStatement.setInt(1, id);

	// Step 4: execute query
	ResultSet resultSet = preparedStatement.executeQuery();

	// Step 5: handling result set

		Department department = new Department();
		department.setId(resultSet.getInt("DepartmentId"));
		department.setName(resultSet.getString("DepartmentName"));

	return department;

	
	
}

}
