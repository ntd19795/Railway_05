package com.vti.entity;

public class Project {
private int projectId;
private int teamSize;
private Manager manager;
private User employees; //các employee tham gia vào project
/**
 * Constructor for class Project.
 * 
 * @Description: .
 * @author: Ducnt
 * @create_date: 25 thg 10, 2020
 * @version: 1.0
 * @modifer: Ducnt
 * @modifer_date: 25 thg 10, 2020
 * @param projectId
 * @param teamSize
 * @param manager
 * @param employees
 */
public Project(int projectId, int teamSize, Manager manager, User employees) {
	super();
	this.projectId = projectId;
	this.teamSize = teamSize;
	this.manager = manager;
	this.employees = employees;
}
/**
 * @return the projectId
 */
public int getProjectId() {
	return projectId;
}
/**
 * @param projectId the projectId to set
 */
public void setProjectId(int projectId) {
	this.projectId = projectId;
	return ;
}
/**
 * @return the teamSize
 */
public int getTeamSize() {
	return teamSize;
}
/**
 * @param teamSize the teamSize to set
 */
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
	return ;
}
/**
 * @return the manager
 */
public Manager getManager() {
	return manager;
}
/**
 * @param manager the manager to set
 */
public void setManager(Manager manager) {
	this.manager = manager;
	return ;
}
/**
 * @return the employees
 */
public User getEmployees() {
	return employees;
}
/**
 * @param employees the employees to set
 */
public void setEmployees(User employees) {
	this.employees = employees;
	return ;
}
/* 
* @see java.lang.Object#toString()
*/
@Override
public String toString() {
	return "Project [projectId=" + projectId + ", teamSize=" + teamSize + ", manager=" + manager + ", employees="
			+ employees + "]";
}


}