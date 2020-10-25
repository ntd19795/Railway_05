package com.vti.entity;

public class User {
	private int id;
	private String FullName;
	private String Email;
	private String Password;
	/**
	 * Constructor for class User.
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
	 */
	public User(int id, String fullName, String email, String password) {
		super();
		this.id = id;
		FullName = fullName;
		Email = email;
		Password = password;
	}
	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "User [id=" + id + ", FullName=" + FullName + ", Email=" + Email + ", Password=" + Password + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
		return ;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return FullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		FullName = fullName;
		return ;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
		return ;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
		return ;
	}
	

}
