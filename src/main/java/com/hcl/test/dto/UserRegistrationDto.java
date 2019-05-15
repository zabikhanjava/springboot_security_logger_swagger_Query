package com.hcl.test.dto;

import java.io.Serializable;

public class UserRegistrationDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String confirmPassword;
	private String city;
	private String email;

	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
