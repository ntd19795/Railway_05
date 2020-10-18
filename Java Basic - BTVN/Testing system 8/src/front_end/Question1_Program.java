package front_end;

import java.util.Collections;

import backend.Question1_List;

public class Question1_Program {

	public static void main(String[] args) {
		Question1_List question1_List = new Question1_List();

		question1_List.initArrayListStudents();

//		a) In ra tổng số phần tử của students
		System.out.print("Tổng số phần tử của students: ");
		System.out.println(question1_List.returnNumberOfStudents());
		System.out.println("\n---------------------\n");

//		b) Lấy phần tử thứ 4 của students
		System.out.println("Information of fourth student:");
		System.out.println("Id: " + question1_List.getFourthStudent().getId());
		System.out.println("Name: " + question1_List.getFourthStudent().getName());
		System.out.println("---------------------");
//		c) In ra phần tử đầu và phần tử cuối của students
		question1_List.printFirstAndLastStudents();

		
////		d. cho them1 thang len dau
		question1_List.addNewStudentToFirstPlace();

//		e) Thêm 1 phần tử vào vị trí cuối của students
		question1_List.addNewStudentToLastPlace();
		
//		f) Đảo ngược vị trí của students

		question1_List.revertStudents();
		Collections.reverse(question1_List.students);

//		g) Tạo 1 method tìm kiếm student theo id
//		question1_List.searchStudentByID();


//		h) Tạo 1 method tìm kiếm student theo name
//		question1_List.searchStudentByName();
		
		//i)
		question1_List.printStudentsHaveSameName ();
		
		//j)
		question1_List.deleteStudentNameHasIdIs2();
		
// k)
		question1_List.deleteStudentIdIs5 ();
		//l)
		
		question1_List.addAllStudentsToStudentCopies();
	}
}
