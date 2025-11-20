package com.example.demo.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hospital_User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/userss")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public List<Hospital_User> getAll(){
		return userService.getAllUser();
	}
	
//	register new user
	@PostMapping("/register")
	public Hospital_User register(@RequestBody Hospital_User user) {
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public Hospital_User login(@RequestBody Hospital_User user) {
		Hospital_User existingUser=userService.loginUser(user.getUsername(), user.getPassword());
		if( existingUser != null) {
			return existingUser;
		}
		throw new RuntimeErrorException(null, "invalid username or password");
	}
}
