/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 06-16-2014
 * 
 * XDoclet definition:
 * @struts.form name="userLoginForm"
 */
public class UserLoginForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** userName property */
	private String userName;

	/** password property */
	private String password;

	/*

	 */

	/** 
	 * Returns the userName.
	 * @return String
	 */
	public String getUserName() {
		return userName;
	}

	/** 
	 * Set the userName.
	 * @param userName The userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}