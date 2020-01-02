package com.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.model.UserRating;

public interface UserRatingRepository extends JpaRepository<UserRating, Integer> {

}
