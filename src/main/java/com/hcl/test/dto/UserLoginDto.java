package com.hcl.test.dto;

import java.io.Serializable;

public class UserLoginDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String confirmPassword;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


}
