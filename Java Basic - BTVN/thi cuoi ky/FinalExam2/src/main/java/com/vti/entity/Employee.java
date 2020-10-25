package com.vti.entity;

public class Employee extends User {

	private Project projectId;
	private String proSkill;
	/**
	 * Constructor for class Employee.
	 * 
	 * @Description: .
	 * @author: Ducnt
	 * @create_date: 25 thg 10, 2020
	 * @version: 1.0
	 * @modifer: Ducnt
	 * @modifer_date: 25 thg 10, 2020
	 * @param id
	 * @param fullName
	 * @param email
	 * @param password
	 * @param projectId
	 * @param proSkill
	 */
	public Employee(int id, String fullName, String email, String password, Project projectId, String proSkill) {
		super(id, fullName, email, password);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Employee [projectId=" + projectId + ", proSkill=" + proSkill + "]";
	}
	/**
	 * @return the projectId
	 */
	public Project getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Project projectId) {
		this.projectId = projectId;
		return ;
	}
	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}
	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
		return ;
	}


}