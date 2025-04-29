package com.xkrm.anestesia.sas.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Users {

	@Id
	@Column(name = "user_email", unique = true, nullable = false)
	private String userEmail;

	@Column(name = "enable", nullable = false)
	private String enable;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Users [userEmail=" + userEmail + ", enable=" + enable + ", name=" + name + ", lastName=" + lastName
				+ "]";
	}

}
