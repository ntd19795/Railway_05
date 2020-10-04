package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	public int group;
	public String groupName;
	public Account creator;
	public LocalDate createDate;
	public String[] usernames;
	public Account[] accounts;

	public Group(int group, String groupName, Account creator, LocalDate createDate, Account[] accounts) {
		this.group = group;
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
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




	@Override
	public String toString() {
		return "Group [group=" + group + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
