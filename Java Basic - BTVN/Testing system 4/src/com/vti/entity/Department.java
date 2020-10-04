package com.vti.entity;

public class Department {
	public int department = 0;
	public String departmentName;
	
	
	Department () {}
	Department (String departmentName) {
		
		this.departmentName = departmentName;
		
	}
	
	public Department(int department, String departmentName) {
		super();
		this.department = department;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [department=" + department + ", departmentName=" + departmentName + "]";
	}
	
}
