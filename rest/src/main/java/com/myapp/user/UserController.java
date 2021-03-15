package com.myapp.user;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public Iterable<User> getUser() {
		
		return userService.getAllUsers();
	}
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		
		return userService.getUsers(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "users/{id}"  )
	public void updateUser(@RequestBody User user,@PathVariable String id) {
		userService.upadateUser(Integer.parseInt(id),user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "users/{id}"  )
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(Integer.parseInt(id));
	}
}
