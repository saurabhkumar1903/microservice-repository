package com.movieinfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movie")
@NoArgsConstructor
@Getter
@Setter
public class Movie {
	@Id
	@GeneratedValue
	private int mid;

	@Column
	private String mname;

}
