package frontend;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import entity.Department;

import backend.DepartmentDao;

public class Ex2 {
public static void main(String[] args) 
		throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
{
	System.out.println("Mời bạn chọn chức năng muốn dùng: ");
	Scanner scanner = new Scanner(System.in);
	int methodnumber = scanner.nextInt();
	if (methodnumber == 1) {
		ex1();
	}
	if (methodnumber == 2) {
		ex2();
	}
	
	else {System.out.println("Không có chức năng này");}
	scanner.close();
}

// _____________________________
public static void ex1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
	List<Department> departments = new DepartmentDao().getDepartments();
	try {
		for (Department department : departments) {
		System.out.println(department);
	}
		
	} catch (Exception e) {
System.out.println("Có lỗi đâu đó rồi ahihi");	}
	
	
	
	
}

//_____________________________

public static void ex2() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
{
	Scanner scanner = new Scanner(System.in);
	int id = scanner.nextInt();
	
	try { 
		Department department = new DepartmentDao().getDepartmentByID(id);

		backend.DepartmentDao.getDepartmentByID(id);
	System.out.println(department);
} catch (Exception e) {
	System.out.println("department.getDepartmentByID.cannotFindDepartmentById");
	}
	
	scanner.close();

}



}
