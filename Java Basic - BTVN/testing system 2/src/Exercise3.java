import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) { // lệnh insert data
		Department Department1 = new Department(); 
		Department1.departmentid = 1;
		Department1.departmentName = "Sale";

		Department Department2 = new Department();
		Department2.departmentid = 2;
		Department2.departmentName = "Marketing";

		Department Department3 = new Department();
		Department3.departmentid = 3;
		Department3.departmentName = "Accounting";

		Department Department4 = new Department();
		Department4.departmentid = 4;
		Department4.departmentName = "HR";

		Department Department5 = new Department();
		Department5.departmentid = 5;
		Department5.departmentName = "WaitingRoom";

		Position Position1 = new Position();
		Position1.position = 1;
		Position1.positionName = PositionName.Dev;

		Position Position2 = new Position();
		Position2.position = 2;
		Position2.positionName = PositionName.Test;

		Position Position3 = new Position();
		Position3.position = 3;
		Position3.positionName = PositionName.Scrum_Master;

		Position Position4 = new Position();
		Position4.position = 4;
		Position4.positionName = PositionName.PM;

		Account Account1 = new Account();
		Account1.accountid = 1;
		Account1.email = "teo.nv@gmail.com";
		Account1.username = "teo.nv";
		Account1.fullName = "Nguyen Van Teo";
		Account1.department = Department1;
		Account1.position = Position1;

		Account Account2 = new Account();
		Account2.accountid = 2;
		Account2.email = "ti.nv@gmail.com";
		Account2.username = "ti.nv";
		Account2.fullName = "Nguyen Van Ti";
		Account2.department = Department5;
		Account2.position = Position2;

		Account Account3 = new Account();
		Account3.accountid = 3;
		Account3.email = "sang.nv@gmail.com";
		Account3.username = "sang.nv";
		Account3.fullName = "Nguyen Van Sang";
		Account3.department = Department5;
		Account3.position = Position3;

		Account Account4 = new Account();
		Account4.accountid = 4;
		Account4.email = "thom.nv@gmail.com";
		Account4.username = "thom.tt";
		Account4.fullName = "Tran Thi Thom";
		Account4.department = Department5;
		Account4.position = Position4;

		Account Account5 = new Account();
		Account5.accountid = 5;
		Account5.email = "nghech.nn@gmail.com";
		Account5.username = "nghech.nn";
		Account5.fullName = "Ngo Ngoc Nghech";
		Account5.department = Department5;
		Account5.position = Position4;

		Group Group1 = new Group();
		Group1.groupID = 1;
		Group1.groupName = "Java";
		Group1.creator = Account1;
		Group1.createDate = LocalDate.of(2020, 07, 1);

		Group Group2 = new Group();
		Group2.groupID = 2;
		Group2.groupName = "Những Con Mèo";
		Group2.creator = Account1;
		Group2.createDate = LocalDate.of(2020, 07, 1);

		Group Group3 = new Group();
		Group3.groupID = 3;
		Group3.groupName = "Những Chiếc Chuột";
		Group3.creator = Account2;
		Group3.createDate = LocalDate.of(2020, 07, 1);

		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.group = Group1;
		GroupAccount1.account = Account1;
		GroupAccount1.JoinDate = LocalDate.of(2020, 8, 1);

		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.group = Group2;
		GroupAccount2.account = Account1;
		GroupAccount2.JoinDate = LocalDate.of(2020, 3, 2);

		GroupAccount GroupAccount3 = new GroupAccount();
		GroupAccount3.group = Group3;
		GroupAccount3.account = Account2;
		GroupAccount3.JoinDate = LocalDate.of(2020, 8, 2);

		GroupAccount GroupAccount4 = new GroupAccount();
		GroupAccount4.group = Group3;
		GroupAccount4.account = Account2;
		GroupAccount4.JoinDate = LocalDate.of(2020, 8, 2);

		GroupAccount GroupAccount5 = new GroupAccount();
		GroupAccount5.group = Group3;
		GroupAccount5.account = Account2;
		GroupAccount5.JoinDate = LocalDate.of(2020, 8, 2);

		GroupAccount groupAccount6 = new GroupAccount();
		groupAccount6.group = Group1;
		groupAccount6.account = Account3;
		groupAccount6.JoinDate = LocalDate.of(2020, 8, 2);
		
//		int category;
//		CategoryName categoryName;
		CategoryQuestion category1 = new CategoryQuestion();
		category1.category  = 1;
		category1.categoryName = CategoryName.Java;
		
		CategoryQuestion category2 = new CategoryQuestion();
		category2.category  = 2;
		category2.categoryName = CategoryName.NET;

		CategoryQuestion category3 = new CategoryQuestion();
		category3.category  = 3;
		category3.categoryName = CategoryName.SQL;
		
		CategoryQuestion category4 = new CategoryQuestion();
		category4.category  = 4;
		category4.categoryName = CategoryName.Postman;
		
		CategoryQuestion category5 = new CategoryQuestion();
		category5.category  = 5;
		category5.categoryName = CategoryName.Ruby;
		

//		int exam;
//		int code;
//		String title;
//		CategoryQuestion category;
//		int duration;
//		Account creator;
//		Date createDate;
		
		Exam exam1 = new Exam();
		exam1.exam = 1;
		exam1.code = 101;
		exam1.title = "Java cơ bản";
		exam1.category = ;
		exam1.duration = 60;
		exam1.creator = Account1;
		exam1.createDate = LocalDate.of(2019,8, 2);
System.out.println(exam1.title + " " +exam1.duration +" " + exam1.category );
//		Exam exam2 = new Exam();
//		exam2.exam = 2;
//		exam2.code = 102;
//		exam2.title = "Java nâng cao";
//		exam2.category = category1;
//		exam2.duration = ;
//		exam2.creator = ;
//		exam2.createDate = ;
//
//		Exam exam3 = new Exam();
//		exam3.exam = 3;
//		exam3.code = 103;
//		exam3.title = "Mysql cơ bản";
//		exam3.category = category3;
//		exam3.duration = ;
//		exam3.creator = ;
//		exam3.createDate = ;
//
//		Exam exam4 = new Exam();
//		exam4.exam = 4;
//		exam4.code = 104;
//		exam4.title = "Mysql nâng cao";
//		exam4.category = 3;
//		exam4.duration = ;
//		exam4.creator = ;
//		exam4.createDate = ;

		// tao array 
		GroupAccount[] GrAccount1 = { GroupAccount1, GroupAccount2 };
		Account1.groups = GrAccount1;
		GroupAccount[] GrAccount2 = { GroupAccount3, GroupAccount4, GroupAccount5 };
		Account2.groups = GrAccount2;
		GroupAccount[] GrAccount3 = {groupAccount6};
		Account3.groups = GrAccount3;
		
		GroupAccount[] AccGroup1 = { GroupAccount1, groupAccount6 };
		Group1.accounts = AccGroup1;
		GroupAccount[] AccGroup2 = { GroupAccount2 };
		Group2.accounts = AccGroup2;	
		GroupAccount[] AccGroup3 = {GroupAccount3, GroupAccount4, GroupAccount5  };
		Group3.accounts = AccGroup3;	

		Account[] accounts = {Account1, Account2, Account3, Account4, Account5 };
		Department[] departments = {Department1,Department2,Department3,Department4,Department5};


//		Exercise 3 (Optional): Date Format
//		Question 1:
//		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//		dạng vietnamese
		System.out.println("Question 1:");
		
//		Question 2:
//		In ra thông tin: Exam đã tạo ngày nào theo định dạng
//		Năm – tháng – ngày – giờ – phút – giây
		System.out.println("\n_________________________");
		System.out.println("Question2");
//		Question 3:
//		Chỉ in ra năm của create date property trong Question 24
		System.out.println("\n_________________________");
		System.out.println("Question3");
//		Question 4:
//		Chỉ in ra tháng và năm của create date property trong Question 2
		System.out.println("\n_________________________");
		System.out.println("Question4");
//		Question 5:
//		Chỉ in ra "MM-DD" của create date trong Question 2
		System.out.println("\n_________________________");
		System.out.println("Question5");
		
}
	
	public static void ex3q1(Exam exam) {
		
		
	}
}
