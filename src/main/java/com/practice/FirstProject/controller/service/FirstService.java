package com.practice.FirstProject.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.FirstProject.dao.LoginRepository;
import com.practice.FirstProject.entity.Login;

@Service
public class FirstService {
	
	@Autowired
	LoginRepository loginObj;

	public String hello() {
		return "Hello";
	}
	
	public List<Login> getUsers() {
		List<Login> allList = loginObj.findAll();
		for(int i=0;i<allList.size();i++) {
			System.out.println(allList.get(i));
			
		}
		return allList;
	}
	
	public Login getUserByUsername(String username) {
		Optional<Login> details=  loginObj.findById(username);
		System.out.println(details.get().getUname());
		System.out.println(details.get().getPass());
		
		return details.get();
	}
	
	public void insertUser(Login obj12) {
		
		/*Login obj = new Login();
		obj.setUname("balu");
		obj.setPass("balu"); */
		
		loginObj.save(obj12);
	}
	
	public void updatePass(Login obj12) {
		Optional<Login> data =  loginObj.findById(obj12.getUname());
		if(data!=null) {
			String uname=  data.get().getUname();
			String pass = data.get().getPass();
			
			data.get().setPass(obj12.getPass());
			Login save = data.get();
			
			
			loginObj.save(save);
		}
	}
	
	public void deleteUser(String userName) {
		loginObj.deleteById(userName);
	}
}
