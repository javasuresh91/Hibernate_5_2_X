package com.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserNameConstruction implements Serializable {

	private String mblNo;
	private String doorNo;

	public String getMblNo() {
		return mblNo;
	}

	public void setMblNo(String mblNo) {
		this.mblNo = mblNo;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

}
