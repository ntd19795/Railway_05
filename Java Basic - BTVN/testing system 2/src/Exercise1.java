import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
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

//		Group groupID;
//		Account accountID;
//		Date JoinDate;

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
////	Exercise 1 (Optional): Flow Control
//		Question1
//		IF
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"

		System.out.println("<				Exercise 1				>");
		System.out.println("<Question 1>");
		ex1q1(Account2);
	
//		Question2
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
		System.out.println(".....................");
		System.out.println("<Question 2>");
		ex1q2(Account1);

//		Question 3:
//		Sử dụng toán tử ternary để làm Question 1
		System.out.println(".....................");
		System.out.println("<Question 3>");
		ex1q3(Account2);
		
//		Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println(".....................");
		System.out.println("<Question 4>");
		ex1q4(Account2);
		
//		Question 5:		
		System.out.println(".....................");
		System.out.println("<Question 5>");
		ex1q5(Group1);
//		Question 6:		
		System.out.println(".....................");
		System.out.println("<Question 6>");
		ex1q6(Account1);
//		Question 7:		
		System.out.println(".....................");
		System.out.println("<Question 7>");		
		ex1q7(Account2);
		System.out.println(".....................");
		System.out.println("<Question 8>");	
		
//		FOREACH
//		Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ
		Account[] accounts = {Account1, Account2, Account3, Account4, Account5 };
		for (Account account : accounts ) {
			System.out.println("Account số "+account.accountid + ":\nEmail: "+account.email+"\nFullname: "+ account.fullName+"\nTên phòng ban: "+account.department.departmentName+"\n");
		}
		System.out.println(".....................");
		System.out.println("<Question 9>");	
//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name	
		Department[] departments = {Department1,Department2,Department3,Department4,Department5};
		for (Department department : departments) {
			System.out.println("ID phòng ban: "+department.departmentid +
					"\nTên Phòng ban: "+ department.departmentName +"\n");
//		Cú pháp cho for
//			for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) {  
//			    // Khối lệnh được thực thi
//			}  
		}
		System.out.println(".....................");
		System.out.println("<Question 10>");	
//		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
		for (int i = 0; i < accounts.length; i = i+1 ) {
		System.out.println("Thông tin account thứ " + (i+1) + " là:");	
		System.out.println("Email: " + accounts[i].email  );
		System.out.println("Fullname: "+ accounts[i].fullName );
		if (accounts[i].department != null) {
			 System.out.println("Tên phòng ban: " + accounts[i].department.departmentName+ "\n");
		} else {System.out.println("Không có phòng ban");}
		}
		
//		Question 11:
//		In ra thông tin các phòng ban bao gồm: id và name
		System.out.println(".....................");
		System.out.println("<Question 11>"); 
		for (int j = 0; j < departments.length; j=j+1) {
		System.out.println("Thông tin department thứ " + (j+1) + " là:");
		System.out.println("DepartmentID: " + departments[j].departmentid);
		System.out.println("DepartmentName: " + departments[j].departmentName+"\n");
		} 

//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		
		System.out.println(".....................");
		System.out.println("<Question 12>"); 
		for (int i = 0; i < 2; i = i+1 ) {
			System.out.println("Thông tin account thứ " + (i+1) + " là:");	
			System.out.println("Email: " + accounts[i].email  );
			System.out.println("Fullname: "+ accounts[i].fullName );
			if (accounts[i].department != null) {
				 System.out.println("Tên phòng ban: " + accounts[i].department.departmentName+ "\n");
			} else {System.out.println("Không có phòng ban");}
			}
//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println(".....................");
		System.out.println("<Question 13>"); 
		for (int i = 0; i < accounts.length; i = i+1 ) {
		if (accounts[i].accountid != 2)
			{System.out.println("Thông tin account thứ " + (i+1) + " là:");	
			System.out.println("Email: " + accounts[i].email  );
			System.out.println("Fullname: "+ accounts[i].fullName );
				if (accounts[i].department != null) {
					System.out.println("Tên phòng ban: " + accounts[i].department.departmentName+ "\n");
				} else {System.out.println("Không có phòng ban");}
			}
		else {};
		}
//		Question 14:
//		In ra thông tin tất cả các account có id < 4
		System.out.println(".....................");
		System.out.println("<Question 14>"); 
		for (int i = 0; i < accounts.length; i = i+1 ) {
		if (accounts[i].accountid < 4)
			{System.out.println("Thông tin account thứ " + (i+1) + " là:");	
			System.out.println("Email: " + accounts[i].email  );
			System.out.println("Fullname: "+ accounts[i].fullName );
				if (accounts[i].department != null) {
					System.out.println("Tên phòng ban: " + accounts[i].department.departmentName+ "\n");
				} else {System.out.println("Không có phòng ban");}
			}
		else {};
		}
		
//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20 
		System.out.println(".....................");
		System.out.println("<Question 15>"); 
		for (int i=0; i<=20; i=i+2) { //Hỏi lại Duy làm kiều gì chỗ %2 các thứ
			System.out.println(i+" ");
			
			
		}
//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
		//code mẫu:
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		Question 16.10:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ 
		System.out.println(".....................");
		System.out.println("<Question 16.10>"); 
		int k=0;
		while (k<accounts.length) 
		
		{ 
		System.out.println("Thông tin account thứ " + (k+1) + " là:");	
		System.out.println("Email: " + accounts[k].email  );
		System.out.println("Fullname: "+ accounts[k].fullName );
		if (accounts[k].department != null) {
			 System.out.println("Tên phòng ban: " + accounts[k].department.departmentName+ "\n");
		} else {System.out.println("Không có phòng ban"); }
		k++;
		if (k==accounts.length) {break;}
		}

//		Question 16.11:
//		In ra thông tin các phòng ban bao gồm: id và name 
		System.out.println(".....................");
		System.out.println("<Question 16.11>"); 
		int j=0;
		while (j<departments.length) {
			System.out.println("Thông tin department thứ " + (j+1) + " là:");
			System.out.println("DepartmentID: " + departments[j].departmentid);
			System.out.println("DepartmentName: " + departments[j].departmentName+"\n");
			j++;
			if (j==departments.length) {break;}
		}
		
//		Question 16.12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println(".....................");
		System.out.println("<Question 16.12>"); 
		int m=0;
		while (m<2) {
			System.out.println("Thông tin account thứ " + (m+1) + " là:");	
			System.out.println("Email: " + accounts[m].email  );
			System.out.println("Fullname: "+ accounts[m].fullName );
			if (accounts[m].department != null) {
				 System.out.println("Tên phòng ban: " + accounts[m].department.departmentName+ "\n");
			} else {System.out.println("Không có phòng ban");}
		m++;
		if (m==2) {break;}
		}
	
//		Question 16.13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2		
		System.out.println(".....................");
		System.out.println("<Question 16.13>"); 
		int n=0;
		while (n<accounts.length) {
			if (accounts[n].accountid != 2)
			{System.out.println("Thông tin account thứ " + (n+1) + " là:");	
			System.out.println("Email: " + accounts[n].email  );
			System.out.println("Fullname: "+ accounts[n].fullName );
				if (accounts[n].department != null) {
					System.out.println("Tên phòng ban: " + accounts[n].department.departmentName+ "\n");
				} else {System.out.println("Không có phòng ban");}
			}
		else {};	
		n++;
		if (n==accounts.length) {break;}
		}
//		Question 16.14:
//			In ra thông tin tất cả các account có id < 4		
		System.out.println(".....................");
		System.out.println("<Question 16.14>"); 
		int a=0;
		while (a<4) {			
			System.out.println("Thông tin account thứ " + (a+1) + " là:");	
			System.out.println("Email: " + accounts[a].email  );
			System.out.println("Fullname: "+ accounts[a].fullName );
				if (accounts[a].department != null) {
					System.out.println("Tên phòng ban: " + accounts[a].department.departmentName+ "\n");
				} else {System.out.println("Không có phòng ban");}
			a++;
			if (a==3) {break;}
		}
//		Question 17.15:
//		In ra thông tin tất cả các account có id < 4	
//		for (int i=0; i<=20; i=i+2) {
//			System.out.println(i+" ");
	System.out.println(".....................");
	System.out.println("<Question 17.15>"); 		
	int b=0;
	do {System.out.println(b+" "); b = b+2; 	 }
	while (b<=20 );

	// % la lay ra so du cua b chia 2
	
	}
	
	
	
	
	
	//Tạo Method
	//Question 1
	public static void ex1q1(Account account) {
		if (account.department == null) {
		System.out.println("Nhân viên này chưa có phòng ban");
	} else System.out.println("Phòng ban của nhân viên này là: " + account.department.departmentName );	
		
	}
//Question2
	public static void ex1q2(Account account) { // public static void: tạo một method, hay gọi là hàm F(x), F là tên
												// hàm, tự đặt tên cho F,
		// x cũng tự đặt, phải cho thêm datatype cho nó (tên x ở đây là account,
		// datatype là Account)
		// Khi nào dùng cái method này thì chạy F(x) ở bên trên. thích chọn x là cái nào
		// thì thay biến đó vào.
			GroupAccount[] groupAccounts = account.groups;
			if (groupAccounts.length == 0) {
				System.out.println("Nhân viên " + account.fullName + " này chưa có group");
			}
			if (groupAccounts.length == 1) {
				System.out.println(
						"Group cua nhan vien " + account.fullName + " nay la: " + groupAccounts[0].group.groupName);
			}
			if (groupAccounts.length == 2) {
				String group1 = groupAccounts[0].group.groupName;
				String group2 = groupAccounts[1].group.groupName;
				System.out.println("Group cua nhan vien " + account.fullName + " nay la: group " + group1 + " và group " + group2);
			}
			if (groupAccounts.length == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
		
	}
//	vi du cho tenary ()
//	String test="";
//	if(x==a){
//		test="chu dep";
//	}
//	esle{
//		test="chu xau";
//	}
//
//	TERNARY
//	String test= (x==a) ? "chu dep":"chu xau";
public static void ex1q3(Account account)	{
// (account.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + account.department.departmentName);
	System.out.println((account.department==null)?"Nhân viên này chưa có phòng ban":"Phòng ban của nhân viên này là: " + account.department.departmentName);
}

//question4
public static void ex1q4(Account account) {
	System.out.println((account.position.positionName==PositionName.Dev)?
						"Đây là Developer" : 
							"Người này không phải Developer");
}
//question5 sử dụng switch case
public static void ex1q5(Group group) {
//	Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
	switch (group.accounts.length) {
	case 1: System.out.println("Nhóm có một thành viên"); break;
	case 2: System.out.println("Nhóm có hai thành viên"); break;
	case 3: System.out.println("Nhóm có ba thành viên"); break;
	default: System.out.println("Nhó có nhiều thành viên"); break;
	
	}
	
}

//Question6: Sử dụng switch case để làm lại Question 2
public static void ex1q6(Account account) {
	GroupAccount[] groupAccounts = account.groups;
	switch (groupAccounts.length) {
	case 0: System.out.println("Nhân viên này chưa có group");break;
	case 1: 
		System.out.println("Group của nhân viên này là " + groupAccounts[0].group.groupName);break;
	case 2: 
		String TenGroupthunhatcuaAccount = groupAccounts[0].group.groupName;
		String TenGroupthu2cuaAccount = groupAccounts[1].group.groupName;
		System.out.println("Group của nhân viên này là " + TenGroupthunhatcuaAccount + " và " + TenGroupthu2cuaAccount);break;
	case 3: System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group" );break;
	case 4: System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");break;
									}
	}
//Question 7: Sử dụng switch case để làm lại Question 4
public static void ex1q7 (Account account ) {
//		System.out.println((account.position.positionName==PositionName.Dev)?
//				"Đây là Developer" : 
//					"Người này không phải Developer");

	switch (account.position.positionName) { 
	case Dev:
		System.out.println("Đây là Developer");break;
	case Test:
		System.out.println("Đây không phải là Developer");break;
	case Scrum_Master:
		System.out.println("Đây không phải là Developer");break;
	case PM:
		System.out.println("Đây không phải là Developer");break;
	}
	
}


}
