import java.time.LocalDate;
import java.util.Date;

public class Program {
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
		
		GroupAccount GroupAccount1 = new GroupAccount();
		GroupAccount1.groupID = Group1;
		GroupAccount1.accountID = Account1;
		GroupAccount1.JoinDate = LocalDate.of(2020, 8, 1);
		
		GroupAccount GroupAccount3 = new GroupAccount();
		GroupAccount3.groupID = Group3;
		GroupAccount3.accountID = Account3;
		GroupAccount3.JoinDate = LocalDate.of(2020, 8, 2);
				
		GroupAccount[] gracc1and3 = {GroupAccount1, GroupAccount3};
		Group1.accounts = gracc1and3;
		
		
		//print
//		System.out.println(Group3.groupID);
//		System.out.println("ID:" + Account1.accountid);
//		System.out.println("joindate 1:" + GroupAccount3.JoinDate);
		
		for (GroupAccount groupAccount : Group1.accounts) {
				System.out.println(groupAccount.accountID.email); //email trong bang account, account foreignkey voi accountID nam trong groupaccount
				System.out.println(groupAccount.JoinDate);
				
		}
	}
}



