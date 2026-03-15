package com.practice.FirstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.FirstProject.controller.service.FirstService;
import com.practice.FirstProject.entity.Login;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FirstController {
	
	@Autowired
	FirstService obj;

	@GetMapping("/getHello")
	public String printHello() {
		String a = obj.hello();
		return a;
	}
	
	@GetMapping("/allUsers")
	public List<Login> getUsers() {
		return obj.getUsers();
	}
	
	@GetMapping("/getUser/{uname}")
	public Login getUsersByUsername(@PathVariable String uname) {
		return obj.getUserByUsername(uname);
	}
	
	@PostMapping("/insertUser")
	public void insertUsert(@RequestBody Login obj12) {
		obj.insertUser(obj12);
	}
	
	@PutMapping("/updatePass")
	public void updatePss(@RequestBody Login obj12) {
		obj.updatePass(obj12);
	}
	
	@DeleteMapping("/deleteUser/{userName}")
	public void removeUser(@PathVariable String userName) {
		obj.deleteUser(userName);
	}
	
}
