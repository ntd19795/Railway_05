package frontend;

import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Program {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream(
				"C:\\Users\\ckery\\eclipse-workspace\\MavenProject\\src\\main\\resource\\database.properties"));

		// step 2: get a connection to database

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// register driver class with drivermanager
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

//		//step 3: Create a statement object
//		Statement statement = connection.createStatement();
//		String sql = "SELECT * FROM testingsystem1.account";

//		step 4: Execute SQL query
//		ResultSet resultSet = statement.executeQuery(sql);

		// Step 5: Handling Result Set
		// EX1 Q1
//		while (resultSet.next()) {
//			//item
//			int id = resultSet.getInt("id");
//			String level = resultSet.getString("level");
//			
//			System.out.println("ID: " +id );
//			System.out.println("Level:"+ level);
//			
//			
//		}
		// Ex1 Q2
//		while (resultSet.next()) {
//		//item
//		int id = resultSet.getInt("AccountID");
//		String AccountID = resultSet.getString("FullName");
//		
//		System.out.println("ID: " +id );
//		System.out.println("Level:"+ AccountID);
//		
		// Ex1 Q3

		// step 3: Create a statement object
//		Statement statement = connection.createStatement();
//		String sql = "insert into `position` (`Position_Name`) value ('TruongPhong')";
//
//		// step 4: Execute SQL query
//		int rouAffectedAmount = statement.executeUpdate(sql);
//		// Step 5: Handling Result Set
//
//		System.out.println(rouAffectedAmount);
//		System.out.println("create xong");
//
//		// Step 6: Close connection
//		connection.close();
//		System.out.println("Mời nhập id muốn xóa: ");
//		Scanner scanner = new Scanner(System.in);
//		int idDelete = scanner.nextInt();



	}

	public static void ex1q4() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		// tao properties
		Properties properties = new Properties();
		properties.load(new FileInputStream(
				"C:\\Users\\ckery\\eclipse-workspace\\MavenProject\\src\\main\\resource\\database.properties"));

		// register driver class with drivermanager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2: get a connection to database
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Connection connection = DriverManager.getConnection(url, username, password);

		// step 3: Create a statement object
		Statement statement = connection.createStatement();
		String sql = "update `Position` set `position_name` = 'DEV' where position_id = 5";

		// step 4: Execute SQL query
		int roundAffectedAmount = statement.executeUpdate(sql);

		// Step 5: Handling Result Set
		System.out.println("roundAffectedAmount: " + roundAffectedAmount);

		// Step 6: Close connection
		connection.close();
	}

	public static void ex1q5(int id) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		// tao properties
		Properties properties = new Properties();
		properties.load(new FileInputStream(
				"C:\\Users\\ckery\\eclipse-workspace\\MavenProject\\src\\main\\resource\\database.properties"));

		// register driver class with drivermanager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// step 2: get a connection to database
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a statement object
		String sql = "Delete from `position` where position_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//Set parameter : tạo tham số
		statement.setInt(1, id);
		
		// execute SQL query with executeUpdate: chay cau lenh sql
		// va cho ra so phan update
		
		int effectedRecordAmount = statement.executeUpdate();
		
		//handing result set
		if (effectedRecordAmount > 0 ) {
			System.out.println("position.delete.complete");}
		else {System.out.println("position.delete.false");
		}
	}

}
