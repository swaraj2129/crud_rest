package com.myapp.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public Iterable<User> getAllUsers(){
//		List<User> users = new ArrayList<>();
//		
//		userRepository.findAll().forEach(users::add);
//		return users;
		return userRepository.findAll();
	}
	public void addUser(User user) {
		userRepository.save(user);
	}
	public Optional<User> getUsers(String id) {
		
		return userRepository.findById(Integer.valueOf(id));
	}
	public void upadateUser(Integer id,User user) {
		userRepository.save(user);
	}
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
