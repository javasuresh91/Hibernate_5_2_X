package com.hibernate.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * There are two type of Key
 * 1. Natural Key :- Primary key(Username) is formed with the business use
 * 2.surrogate key :- Primary key(userId-just id) is formed with the non-business use
 */
@Entity
public class UserDetails {
/**
 * @GeneratedValue
 * 1. AUTO : Default Strategy(If we do not mention the strategy) 
 * 2. IDENTITY : Hibernate use the identity column(SQL Server,MySql) and generate the key value
 * 3. SEQUENCE : 
 * 4. TABLE : Hibernate use the table to generate the key
 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	private Date joinedDate;
	private String address;
	private String description;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
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
