package com.hibernate.dto;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@EmbeddedId
	private UserNameConstruction userName;
	private Date joinedDate;
	private String address;
	private String description;

	public UserNameConstruction getUserName() {
		return userName;
	}

	public void setUserName(UserNameConstruction userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
