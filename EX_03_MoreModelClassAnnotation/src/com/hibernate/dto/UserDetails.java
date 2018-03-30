package com.hibernate.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "User_De") /** 1. It used to create the name of the table, wont affect the table name */
public class UserDetails {

	@Id
	private int userId;
	/**
	 * If we mark the variable as static or transient, hibernate wont create column in the database
	 */
	@Transient
	private String name;
	/**
	 * This Annotation is used to insert the time or date alone based on Temporal type instead of Full Timestamp
	 */
	@Temporal(TemporalType.TIME)
	private Date joinedDate;
	private String address;
	/**
	 * This is used store the huge amount of data more than 255 character
	 */
	@Lob
	private String description;

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
