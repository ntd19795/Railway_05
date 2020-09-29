import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
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
		GroupAccount4.group = Group3;
		GroupAccount4.account = Account2;
		GroupAccount4.JoinDate = LocalDate.of(2020, 8, 2);

		GroupAccount groupAccount6 = new GroupAccount();
		groupAccount6.group = Group1;
		groupAccount6.account = Account3;
		groupAccount6.JoinDate = LocalDate.of(2020, 8, 2);

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

//	Exercise 2 (Optional): System out printf
		System.out.println("Question 1:");
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó
		System.out.printf ("%d" , 5);
		System.out.println("\n_________________________");
		System.out.println("Question2");
//			Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.printf(Locale.US, "%,d %n", 100000000);
		
		System.out.println("\n_________________________");
		System.out.println("Question3");
//			Question 3:
//			Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//			thực đó chỉ bao gồm 4 số đằng sau
		
		System.out.printf("%5.2f %n", 5.567098);
		
		System.out.println("\n_________________________");
		System.out.println("Question4");
//			Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		String tenhocsinh = "Nguyen Van A";
		System.out.printf("Tên tôi là %s và tôi đang độc thân.", tenhocsinh);
		
//			Question 5:
//			Lấy thời gian bây giờ và in ra theo định dạng sau:
//			24/04/2020 11h:16p:20s
		
		System.out.println("\n_________________________");
		System.out.println("Question5");		
		Date date = new Date(); 
//		System.out.println(date);
		System.out.printf("%1$td/%1$tm/%1$tY %tHh:%tMp:%tSs", date, date, date);
		
//			Question 6:
//			In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//			table (giống trong Database)	
		System.out.println("\n_________________________");
		System.out.println("Question6");
		System.out.printf("%-20s %-20s %-20s \n", "Accountid", "Fullname", "Email");
		System.out.printf("%-20s %-20s %-20s\n", Account1.accountid, Account1.fullName, Account1.email);
		System.out.printf("%-20s %-20s %-20s\n", Account2.accountid, Account2.fullName, Account2.email);
		
		
}
}
