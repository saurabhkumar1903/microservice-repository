package com.rating.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserRatingId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "uid")
	private int uid;
	@Column(name = "mid")
	private int mid;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mid;
		result = prime * result + uid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRatingId other = (UserRatingId) obj;
		if (mid != other.mid)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}

}
