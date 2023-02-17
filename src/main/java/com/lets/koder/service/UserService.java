package com.lets.koder.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lets.koder.entity.User;
import com.lets.koder.repository.UserRepository;

@Service
public class UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	
	// create user
	public String createUser(User user) {

		Optional<User> userName = userRepository.findByUserName(user.getUserName());
		if (userName.isPresent()) {
			return "User Name - " + user.getUserName() + " is already exist please try with other username.";
		} else {
			userRepository.save(user);
			logger.info("User saved successfully.");
			return "User - " + user.getUserName() + " is Registered Successfully.";
		}
	}
	
	// Fetch all users
	public List<User> fetchAllUsers(){
		
		List<User> users = userRepository.findAll();
		logger.info("All users: "+users);
		return users;	
	}
	// find user by username
	public Optional<User> findByUserName(String userName) {
		
		Optional<User> user = userRepository.findByUserName(userName);
		logger.info("User Details by username - "+userName + user);
		return user;
	}
}
