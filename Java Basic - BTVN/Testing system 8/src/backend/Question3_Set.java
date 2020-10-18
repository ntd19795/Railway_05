package backend;
import java.util.*;


import backend.Question1_List;
import entity.Student;

public class Question3_Set {
	private Set<Student> students;
	private Scanner scanner;

	
	public Question3_Set() {
		scanner = new Scanner(System.in);
		students = new HashSet<>();
		inputStudents();	
		}
	
private void inputStudents() {
	students.add(new Student("Thành"));
	students.add(new Student("Quang"));
	students.add(new Student("Kiên"));
	students.add(new Student("Duy"));
	students.add(new Student("Thắng"));
	students.add(new Student("Bích"));
	}


public void printStudent() {
	Iterator<Student> studentIterator = students.iterator();
	while (studentIterator.hasNext()) {
		System.out.println(studentIterator.next());
	}
}
public void getAmountOfStudent() {
	System.out.println("Student Amount: " + students.size());

}

public void getIndex4OfStudent() {
	Iterator<Student> studentIterator = students.iterator();
	for (int i = 0; i < 2; i++) {
		studentIterator.next();
	}

	System.out.println("Student thứ 4: ");
	System.out.println(studentIterator.next());
}

public void printFirstAndLastStudent() {
	Iterator<Student> studentIterator = students.iterator();
	System.out.println("Student đầu tiên:");
	System.out.println(studentIterator.next());

	for (int i = 0; i < students.size() - 2; i++) {
		studentIterator.next();
	}

	System.out.println("Student cuối cùng: ");
	System.out.println(studentIterator.next());
}

////d) Thêm 1 phần tử vào vị trí đầu của students => 
//public void addNewStudentToFirstPlace() {
//	System.out.println("d) cho them1 thang len dau ");
//
//	System.out.println("hoc sinh dau tien hien tai la: ");
//	System.out.println(getStudentByIndex(0).toString());
//	//them 1 thang vao dau
//	students.add(0, new Student(0, "Linh"));
//	System.out.println("Hoc sinh ban dau sau khi them vao la: " + getStudentByIndex(0).toString());
//	for (Student student : students) {
//		System.out.println(student);
//	}
//	System.out.println("---------------------");
//
//}

//e) Thêm 1 phần tử vào vị trí cuối của students
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

//f) Đảo ngược vị trí của students
public void revertStudents() {
System.out.println("f) Đảo ngược vị trí của students \n Không đảo được set ");


}

//g) Tạo 1 method tìm kiếm student theo id - lỗi
//public void searchStudentByID () {
//System.out.println("g) Tạo 1 method tìm kiếm student theo id ");
//
//Scanner scanner = new Scanner(System.in);
//System.out.println("Mời bạn nhập id muốn tìm: ");
//int a = scanner.nextInt();
//System.out.println("Thông tin học sinh có id " + 	getStudentByIndex(a).getId() + " là " + getStudentByIndex(a).toString() );
//scanner.close();
//System.out.println("---------------------");
//}


//h) Tạo 1 method tìm kiếm student theo name

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

//i) Tạo 1 method để in ra các student có trùng tên
public void printStudentsHaveSameName () {
System.out.println("i) Tạo 1 method để in ra các student có trùng tên ");

System.out.println("Chịu");
System.out.println("---------------------");

}

////j) Xóa name của student có id = 2;
//public void deleteStudentNameHasIdIs2 () {
//System.out.println("j) Xóa name của student có id = 2 ");
//System.out.println("Học sinh id = 2 là: " + getStudentByIndex(2));
//for (Student student : students) {
//if (student.getId() == 2) {
//	student.setName(null);;
//}	
//System.out.println(student.toString());
//}	
//
//System.out.println("---------------------");
//
//}

//k) Delete student có id = 5;
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
