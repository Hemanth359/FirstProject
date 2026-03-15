package com.practice.FirstProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

	@Id
	private String uname;
	
	
	private String pass;
	
	private String maiId;
	
	

	public String getMaiId() {
		return maiId;
	}

	public void setMaiId(String maiId) {
		this.maiId = maiId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pass=" + pass + "]";
	}
	
	
	
}
