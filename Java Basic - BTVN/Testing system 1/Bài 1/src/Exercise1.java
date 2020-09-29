import java.time.LocalDate;
import java.util.Date;

public class Exercise1 {
	public static void main(String[] args) { //lệnh insert data
		Department saleDepartment = new Department(); //đặt 1 biến mới rồi mới set dâta, vì thằng java này ko lưu data, chỉ là những câu lệnh. Sau sẽ import từ my sql
		saleDepartment.departmentid = 1;
		saleDepartment.departmentName = "Sale";

		Department marketingDepartment = new Department();
		marketingDepartment.departmentid = 2;
		marketingDepartment.departmentName = "Marketing";
		
		Department AccountingDepartment = new Department();
		AccountingDepartment.departmentid = 3;
		AccountingDepartment.departmentName = "Accounting";
		
		Department HRDepartment = new Department();
		HRDepartment.departmentid = 4;
		HRDepartment.departmentName = "HR";
		
		Department WaitingRoomDepartment = new Department();
		WaitingRoomDepartment.departmentid = 5;
		WaitingRoomDepartment.departmentName = "HR";
		
		Position Position1 = new Position();
		Position1.positionID = 1;
		Position1.positionName = PositionName.Dev;
		
		Position Position2 = new Position();
		Position2.positionID = 2;
		Position2.positionName = PositionName.Test;

		Position Position3 = new Position();
		Position3.positionID = 3;
		Position3.positionName = PositionName.Scrum_Master;
		
		Position Position4 = new Position();
		Position4.positionID = 4;
		Position4.positionName = PositionName.PM;
		

		Account Account1 = new Account();
		Account1.accountid = 1;
		Account1.email = "teo.nv@gmail.com";
		Account1.username = "teo.nv";
		Account1.fullName = "Nguyen Van Teo";
		Account1.department = saleDepartment;
		Account1.positionid = Position1;
		
		Account Account2 = new Account();
		Account2.accountid = 2;
		Account2.email = "ti.nv@gmail.com";
		Account2.username = "ti.nv";
		Account2.fullName = "Nguyen Van Ti";
		Account2.department = marketingDepartment;
		Account2.positionid = Position2;
		
		Account Account3 = new Account();
		Account3.accountid = 3;
		Account3.email = "sang.nv@gmail.com";
		Account3.username = "sang.nv";
		Account3.fullName = "Nguyen Van Sang";
		Account3.department = WaitingRoomDepartment;
		Account3.positionid = Position3;

		Account Account4 = new Account();
		Account4.accountid = 4;
		Account4.email = "thom.nv@gmail.com";
		Account4.username = "thom.tt";
		Account4.fullName = "Tran Thi Thom";
		Account4.department = AccountingDepartment;
		Account4.positionid = Position4;

		Account Account5 = new Account();
		Account5.accountid = 5;
		Account5.email = "nghech.nn@gmail.com";
		Account5.username = "nghech.nn";
		Account5.fullName = "Ngo Ngoc Nghech";
		Account5.department = HRDepartment;
		Account5.positionid = Position4;
		
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
		Group3.creator = Account1;
		Group3.createDate = LocalDate.of(2020, 07, 1);
		
		
	
//		Group groupID;
//		Account accountID;
//		Date JoinDate;
		// loại data + tên biến = new data
//		Đặt biến mới với groupid = groupID = biến Group1...
		
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.groupID = Group1;
		GroupAccount1.accountID = Account1;
		GroupAccount1.JoinDate = LocalDate.of(2020, 8, 1);
		
		GroupAccount GroupAccount2 = new GroupAccount();
		GroupAccount2.groupID = Group1;
		GroupAccount2.accountID = Account1;
		GroupAccount2.JoinDate = LocalDate.of(2020, 8, 1);
		
		
		GroupAccount GroupAccount3 = new GroupAccount();
		GroupAccount3.groupID = Group3;
		GroupAccount3.accountID = Account3;
		GroupAccount3.JoinDate = LocalDate.of(2020, 8, 2);
				
		GroupAccount[] gracc1and3 = {GroupAccount2, GroupAccount3};
		Group1.accounts = gracc1and3;
		
		
////	Exercise 1 (Optional): Flow Control
//		IF
//		Question 1:
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
		if (Account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}
		
		
		
//		Question 2:
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
//		Question 3:
//		Sử dụng toán tử ternary để làm Question 1
//		Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"
//		SWITCH CASE
//		Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"2
//		Question 6:
//		Sử dụng switch case để làm lại Question 2
//		Question 7:
//		Sử dụng switch case để làm lại Question 4
//		FOREACH
//		Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ
//		Question 9:
//		In ra thông tin các phòng ban bao gồm: id và name
//		FOR
//		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
//		Question 11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
//		Thông tin department thứ 2 là:
//		Id: 2
//		Name: Marketing
//		Question 12:
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
//		Question 13:
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
//		Question 14:
//		In ra thông tin tất cả các account có id < 4
//		Question 15:
//		In ra các số chẵn nhỏ hơn hoặc bằng 203
//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
//		DO-WHILE
//		Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//		lệnh break, continue
	}
}



