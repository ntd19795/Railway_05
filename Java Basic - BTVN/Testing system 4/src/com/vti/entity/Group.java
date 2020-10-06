package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	private int group;
	private String groupName;
	private Account creator;
	private LocalDate createDate;
	private String[] usernames;
	private Account[] accounts;

	public Group(int group, String groupName, Account creator, LocalDate createDate, Account[] accounts) {
		this.group = group;
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}


	
	
public Group(String groupName, Account creator, LocalDate createDate, String[] usernames) {
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.usernames = usernames;
		
		Account[] accountTemps = new Account[usernames.length];
		
		for (int i = 0; i < usernames.length; i++) {
			accountTemps[i] = new Account(usernames[i]);
			
			}
		}
	




//	
//	public Group(int group, String groupName, Account creator, LocalDate createDate, String[] usernames) {
//		super();
//		this.group = group;
//		this.groupName = groupName;
//		this.creator = creator;
//		this.createDate = createDate;
//		this.usernames = usernames;
//	}




	public int getGroup() {
	return group;
}




public void setGroup(int group) {
	this.group = group;
}




public String getGroupName() {
	return groupName;
}




public void setGroupName(String groupName) {
	this.groupName = groupName;
}




public Account getCreator() {
	return creator;
}




public void setCreator(Account creator) {
	this.creator = creator;
}




public LocalDate getCreateDate() {
	return createDate;
}




public void setCreateDate(LocalDate createDate) {
	this.createDate = createDate;
}




public String[] getUsernames() {
	return usernames;
}




public void setUsernames(String[] usernames) {
	this.usernames = usernames;
}




public Account[] getAccounts() {
	return accounts;
}




public void setAccounts(Account[] accounts) {
	this.accounts = accounts;
}




	@Override
	public String toString() {
		return "Group [group=" + group + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
