package com.rating.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="User")
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue
	private int uid;

	@Column
	private String uname;

	 
	@OneToMany(mappedBy = "listOfUsers",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Movie> listOfMovies = new ArrayList<>();

}
