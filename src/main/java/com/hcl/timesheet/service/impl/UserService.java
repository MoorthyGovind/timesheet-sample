package com.hcl.timesheet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.timesheet.UserRepository;
import com.hcl.timesheet.entity.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRespoitory;
	
	public User getUser(long id) {
		return userRespoitory.findById(id);
	}
}
