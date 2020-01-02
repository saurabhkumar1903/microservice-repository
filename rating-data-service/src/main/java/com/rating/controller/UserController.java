package com.rating.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.model.UserRating;
import com.rating.repository.UserRatingRepository;

@RestController
@RequestMapping(value = "/movieinfo")
public class UserController {

//	@Autowired
//	private UserRatingRepository userRatingRepository;
//
//	@GetMapping(value = "/{id}")
//	public Optional<UserRating> findById(@PathVariable("id") int id) {
//		return userRatingRepository.findById(id);
//	}
//
//	@GetMapping(value = "/all")
//	public List<UserRating> findAll() {
//		return userRatingRepository.findAll();
//	}
//
//	@PostMapping(value = "/saving")
//	public UserRating save(@RequestBody UserRating userRating) {
//		return userRatingRepository.save(userRating);
//	}

}
