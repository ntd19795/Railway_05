package backend;

import java.util.*;

import entity.Student;

public class Question1_List {

//biến nguyên thủy: int, float, double, character, ...
//Ví dụ khai báo: int i;
//Ví dụ khởi tạo: i = 5;
//ví dụ vừa khai báo vừa khởi tạo: int i = 5;



// Khai báo 1 List students:
	public static List<Student> students;

	// constructor
	public Question1_List() {
		students = new ArrayList<Student>(); // Khởi tạo ArrayList students
	}

	public static void initArrayListStudents() {
		students.add(new Student("Phong"));
		students.add(new Student("Hai"));
		students.add(new Student("Hai"));
		students.add(new Student("An"));
		students.add(new Student("Phong"));
		students.add(new Student("Phong"));
	}

	// a) In ra tổng số phần tử của students
	public int returnNumberOfStudents() {
		return students.size();
	}
	// in ra hoc sinh đứng thứ index
	public Student getStudentByIndex(int index) {
		return students.get(index);
	}

//	b) Lấy phần tử thứ 4 của students
	public Student getFourthStudent() {
		return getStudentByIndex(3);
		
		
	}

//	c) In ra phần tử đầu và phần tử cuối của students
	public void printFirstAndLastStudents() {
		System.out.println("c) In ra phần tử đầu và phần tử cuối của students");

		// lay thang dau tien
		System.out.println("Information of first student:");
		System.out.println("Id: " + getStudentByIndex(0).getId());
		System.out.println("Name: " + getStudentByIndex(0).getName());

		// lay thang cuoi. 1. Dem tong -> lay tong -1 la ra thang cuoi
		System.out.println("Information of last student:");
		System.out.println("Id: " + getStudentByIndex(returnNumberOfStudents() - 1).getId());
		System.out.println("Name: " + getStudentByIndex(returnNumberOfStudents() - 1).getName());
		System.out.println("---------------------");

	}
//	d) Thêm 1 phần tử vào vị trí đầu của students => 
	public void addNewStudentToFirstPlace() {
		System.out.println("d) cho them1 thang len dau ");

		System.out.println("hoc sinh dau tien hien tai la: ");
		System.out.println(getStudentByIndex(0).toString());
		//them 1 thang vao dau
		students.add(0, new Student(0, "Linh"));
		System.out.println("Hoc sinh ban dau sau khi them vao la: " + getStudentByIndex(0).toString());
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("---------------------");

	}
	
//	e) Thêm 1 phần tử vào vị trí cuối của students
public void addNewStudentToLastPlace() {
	System.out.println("e) cho them1 thang len dau ");

		System.out.println("danh sach hoc sinh hien tai la: ");
		for (Student student : students) {
			System.out.println(student);}
		//them 1 thang vao dau
		students.add(new Student("Minh"));
		System.out.println("Danh sach hoc sinh sau khi them vao la: ");
		for (Student student2 : students) {
			System.out.println(student2);
		}
		System.out.println("---------------------");

	}
	
//	f) Đảo ngược vị trí của students
public void revertStudents() {
	Collections.reverse(students);
	System.out.println("f) Danh sach hoc sinh sau khi dao nguoc la: ");
	for (Student student : students) {
		System.out.println(student);
}
	
}

//	g) Tạo 1 method tìm kiếm student theo id
public void searchStudentByID () {
	System.out.println("g) Tạo 1 method tìm kiếm student theo id ");

	Scanner scanner = new Scanner(System.in);
	System.out.println("Mời bạn nhập id muốn tìm: ");
	int a = scanner.nextInt();
	System.out.println("Thông tin học sinh có id " + 	getStudentByIndex(a).getId() + " là " + getStudentByIndex(a).toString() );
	scanner.close();
	System.out.println("---------------------");
}


//	h) Tạo 1 method tìm kiếm student theo name

public void searchStudentByName() {
	System.out.println("h) Tạo 1 method tìm kiếm student theo name ");

	Scanner scanner = new Scanner(System.in);
	System.out.println("Mời bạn nhập tên học sinh muốn tìm: (Không viết hoa)");
	String a = scanner.nextLine();
	for (Student student : students) {
		if (student.getName().toLowerCase().contains(a)) {

			System.out.println(student.toString());
		}

	}
	scanner.close();
	System.out.println("---------------------");
	
}

//	i) Tạo 1 method để in ra các student có trùng tên
public void printStudentsHaveSameName () {
	System.out.println("i) Tạo 1 method để in ra các student có trùng tên ");

	System.out.println("Chịu");
	System.out.println("---------------------");

}

//	j) Xóa name của student có id = 2;
public void deleteStudentNameHasIdIs2 () {
	System.out.println("j) Xóa name của student có id = 2 ");
System.out.println("Học sinh id = 2 là: " + getStudentByIndex(2));
for (Student student : students) {
	if (student.getId() == 2) {
		student.setName(null);;
	}	
	System.out.println(student.toString());
}	

	System.out.println("---------------------");

}

//	k) Delete student có id = 5;
public void deleteStudentIdIs5 () {
	System.out.println("k) Delete student có id = 5 ");
	
	Iterator<Student> iterator = students.iterator();
	while (iterator.hasNext()) {
	    Student student = iterator.next();
	    if (student.getId() == 5) {
	        // languages.remove(language); // Don't use ArrayList.remove()
	        iterator.remove();
	    }
	}
	System.out.println(students.toString());

	System.out.println("---------------------");
	}

//l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies

public void addAllStudentsToStudentCopies() {
	System.out.println("l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies ");

	ArrayList<Student> studentCopies = new ArrayList<>();
	studentCopies.addAll(students);
	System.out.println(studentCopies.toString());
	
	System.out.println("---------------------");

}

}





