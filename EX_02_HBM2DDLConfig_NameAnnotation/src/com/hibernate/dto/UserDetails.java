package com.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 1. It will change the Entity name from UserDetails to user_details(Used in
 * the HQL) 2. This 'name' Attribute will taken by the hibernate to create the
 * table rather than the class or Entity name
 */
@Entity(name = "User_Details")
public class UserDetails {

	@Id
	private int userId;
	/**
	 * This 'name' Attribute will taken by the hibernate to create the column rather
	 * than the variable name
	 */
	@Column(name = "USER_NAME") 
	private String name;

	private Date joinedDate;
	private String address;
	private String description;

	@Column(name = "USER_ID")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
