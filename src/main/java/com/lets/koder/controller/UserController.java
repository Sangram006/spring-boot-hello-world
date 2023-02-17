package com.lets.koder.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lets.koder.entity.User;
import com.lets.koder.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String sendGreetings() {
		return "Hello, World!";
	}

	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		String resMessage = userService.createUser(user);
		logger.info(resMessage);
		return resMessage;
	}

	@GetMapping("/getallUsers")
	public List<User> getAllUsers() {

		return userService.fetchAllUsers();
	}

	@GetMapping("/getUser/{userName}")
	public String getUserByName(@PathVariable String userName) {
		Optional<User> user = userService.findByUserName(userName);

		if (user.isPresent()) {
			return "User details: " + user;
		} else {
			return "Username - " + userName + " does not exist";
		}
	}
}
