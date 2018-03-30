package com.hibernate.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ElementCollection
 * This is used to create the child table and insert collection Records into it
 *
 */
@Entity
public class UserDetails {

	@Id
	private int userId;
	private String userName;
	@ElementCollection
	private Set<Address> setOfAddress = new HashSet<Address>();
	

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

	public Set<Address> getSetOfAddress() {
		return setOfAddress;
	}

	public void setSetOfAddress(Set<Address> setOfAddress) {
		this.setOfAddress = setOfAddress;
	}



}
