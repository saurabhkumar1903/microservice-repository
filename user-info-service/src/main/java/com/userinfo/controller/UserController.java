package com.userinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userinfo.model.User;
import com.userinfo.repository.UserRepository;

@RestController
@RequestMapping(name="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/id/{id}")
	public Optional<User> findById(@PathVariable("id") int id)
	{
		return userRepository.findById(id);
	}
	
	@GetMapping(value="/all")
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
	
	@PostMapping(value="/save")
	public User save(@RequestBody User user)
	{
		return userRepository.save(user);
	}

}
