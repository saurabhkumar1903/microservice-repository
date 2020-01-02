package com.rating.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="UserRating")
@Table(name = "user_rating")
@NoArgsConstructor
@Getter
@Setter
public class UserRating {

	@EmbeddedId
	private UserRatingId userRatingId;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("uid")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("mid")
	private Movie movie;

	@Column(name = "created_on")
	private Date createdOn = new Date();

	@Column(name = "rating")
	private int rating;
}
