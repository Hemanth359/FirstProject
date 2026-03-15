package com.practice.FirstProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserInfo {

	@Id
	private int idNumber;

	private String name;

	public int getIdNumber() {
		return idNumber;
	}

	public UserInfo(int idNumber, String name) {
		super();
		this.idNumber = idNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserInfo [idNumber=" + idNumber + ", name=" + name + "]";
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
