package com.vti.entity;

import java.time.LocalDate;


//ex1q2


public class Account {
	private int accountid;
	private String email;
	private String username;
	private String firstName;
	private String lastName;
	private String fullName = firstName+" "+lastName;
	private Department department;
	private String position;
	private Group group;
	private LocalDate createDate ;
	private Group[] groups;
	
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


	
	
	public Account(String usernames) {
		this.username = usernames;
		
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return groups;
	}
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	
	
}

