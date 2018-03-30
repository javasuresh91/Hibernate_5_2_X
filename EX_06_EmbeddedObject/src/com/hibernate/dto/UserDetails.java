package com.hibernate.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
/**
 * Two types of HIbernate Object
 * Value Object(Address) : Is an object, has an data and it has be save in the database bt does not have a meaning itself, it give the meaning 
 * for the another object(UserDetails)
 * Entity(UserDetails) : it has data and it should be saved in the database, bt has its own usage or meaning
 * 
 * @Embedded :
 * This tells the hibernate it is the value object of this(UserDetails) entity and creates the column in the entity instead of creating the seperate table
 * 
 * @AttributeOverride :
 * In this entity we have two address(ofzAddress,homeAddress), which use the same Column name in the Address, to override the column we use it.
 * 
 */
	
	@Id
	private int userId;
	private String userName;
	private Date joinedDate;
	@Embedded
	private Address homeAddress; /** Value Object*/
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="ofzStreet")),
		@AttributeOverride(name="city",column=@Column(name="ofzCity")),
		@AttributeOverride(name="state",column=@Column(name="ofzState")),
		@AttributeOverride(name="pincode",column=@Column(name="ofzPincode"))	
	})	
	private Address ofzAddress;
	
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

	
	

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfzAddress() {
		return ofzAddress;
	}

	public void setOfzAddress(Address ofzAddress) {
		this.ofzAddress = ofzAddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
