package com.hcl.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.timesheet.entity.User;
import com.hcl.timesheet.service.impl.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public User getUser() {
		User user = userService.getUser(1);
		System.out.println("user::: "+user);
		return user;
	}
}
