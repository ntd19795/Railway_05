package com.vti.entity;

import java.time.LocalDate;

public class program {
	public static void main(String[] args) {
//	Account account = new Account("Nguyễn Văn A");

		Department d1 = new Department(5, "con heo");

		System.out.println(d1);
//	Position position1id = new Position();
//	Position position1name = new Position("Pet");
		Account account1 = new Account(1, "concho@gmail.com", "concho", "con", "cho", "java", LocalDate.now()
		);
		Account account2 = new Account(2, "conmeo@gmail.com", 
				"conmeo	", "con", 
				"meo", "mysql", LocalDate.now()
		);
		ex1q2a(account1);
		Account[] groupsAccount1 = {account1,account2 };
		
		Group group1 = new Group(1, "Pet", account1, 
				LocalDate.now(),groupsAccount1 );
		
		
	System.out.println(" __________________\nQuestion2.b ");
		ex1q3b(group1);

		
	}
	public static void ex1q2a(Account account) {
		System.out.println(account);
		
	}
	public static void ex1q3b(Group group) {
	System.out.println(group);
	}
	
	
}
