package com.vti.entity;

public class Department {
	private int department = 0;
	private String departmentName;
	
	
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
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
