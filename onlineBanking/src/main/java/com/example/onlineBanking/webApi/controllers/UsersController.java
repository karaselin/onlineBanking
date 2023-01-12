package com.example.onlineBanking.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineBanking.business.abstracts.UserService;
import com.example.onlineBanking.entities.concretes.User;

/*
 *@AuthorSelinKara
 */

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> users = userService.getAll();
		return users;
	}
	
	@PostMapping(path = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody User user) {
		this.userService.createUser(user);
	}

	@PutMapping("/update")
	public void update(User user) {
		this.userService.updateUser(user);
	}

}
