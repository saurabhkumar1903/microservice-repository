package com.movieinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.model.Movie;
import com.movieinfo.repository.UserRatingRepository;


@RestController
@RequestMapping(value="/movieinfo")
public class UserController {
	
	@Autowired
	private UserRatingRepository movieRepository;
	
	@GetMapping(value="/{id}")
	public Optional<Movie> findById(@PathVariable("id") int id)
	{
		return movieRepository.findById(id);
	}
	
	@GetMapping(value="/all")
	public List<Movie> findAll()
	{
		return movieRepository.findAll();
	}
	
	@PostMapping(value="/saving")
	public Movie save(@RequestBody Movie movie)
	{
		return movieRepository.save(movie);
	}

}
