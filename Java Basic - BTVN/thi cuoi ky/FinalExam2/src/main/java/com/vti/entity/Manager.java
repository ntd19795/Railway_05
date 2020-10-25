package com.vti.entity;

public class Manager extends User {

private float expInYear;

/**
 * Constructor for class Manager.
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
 * @param expInYear
 */
public Manager(int id, String fullName, String email, String password, float expInYear) {
	super(id, fullName, email, password);
	this.expInYear = expInYear;
}

/**
 * @return the expInYear
 */
public float getExpInYear() {
	return expInYear;
}

/**
 * @param expInYear the expInYear to set
 */
public void setExpInYear(float expInYear) {
	this.expInYear = expInYear;
	return ;
}

/* 
* @see java.lang.Object#toString()
*/
@Override
public String toString() {
	return "Manager [expInYear=" + expInYear + "]";
}


}