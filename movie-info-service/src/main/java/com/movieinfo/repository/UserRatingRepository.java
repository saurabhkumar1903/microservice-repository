package com.movieinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieinfo.model.Movie;

public interface UserRatingRepository extends JpaRepository<Movie, Integer> {

}
