package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int accountid;
	public String email;
	public String username;
	public String firstName;
	public String lastName;
	public String fullName = firstName+" "+lastName;
	public Department department;
	public String position;
	public Group group;
	public LocalDate createDate ;
	public Group[] groups;
	
	public Account(int accountid, String email, String username, String firstName, String lastName) {
		super();
		this.accountid = accountid;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Account(int accountid, String email, String username, String firstName, String lastName, String position,
//			LocalDate createDate) {
//		this.accountid = accountid;
//		this.email = email;
//		this.username = username;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.position = position;
//		this.createDate = LocalDate.now();
//	}
	public Account(int accountid, String email, String username, String firstName, String lastName, String position,
			LocalDate createDate) {

		this.accountid = accountid;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", \nemail=" + email + ", \nusername=" + username + ", \nfirstName="
				+ firstName + ", \nlastName=" + lastName + ", \nfullName=" + fullName + ", \ndepartment=" + department
				+ ", \nposition=" + position + ", \ngroup=" + group + ", \ncreateDate=" + createDate + "]";
	}
	

	
	
}

