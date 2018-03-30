package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @Embeddable :
 * This tells the hibernate not to create table and used this entity as a Value object of some other Entity object
 * 
 * @Column:
 * This tells the hibernate to take the column name for the embedded object
 */
@Embeddable
public class Address {

	@Column(name="str")
	private String street;
	private String city;
	private String state;
	private String pincode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
