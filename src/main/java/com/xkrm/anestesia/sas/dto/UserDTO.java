package com.xkrm.anestesia.sas.dto;

import jakarta.validation.constraints.NotNull;

public class UserDTO {
	
	@NotNull
	private String userEmail;
	
	@NotNull
	private String enable;
	
	@NotNull
	private String name;
	
	@NotNull
	private String lastName;
	
	public UserDTO(String userEmail, String enable, String name, String lastName) {
		super();
		this.userEmail = userEmail;
		this.enable = enable;
		this.name = name;
		this.lastName = lastName;
	}

	public UserDTO() {
		super();
	}

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

}
