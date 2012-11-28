package bzh.msansm1.medek.model.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for UserMovie
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_user_movie")
public class UserMovie implements Serializable{

	private static final long serialVersionUID = 4877304758356761363L;

	private Integer user;
	private Integer movie;
	private Integer rating;
	private String comment;

	public UserMovie() {
		super();
	}

	public UserMovie(Integer user, Integer movie, Integer rating, String comment) {
		super();
		this.user = user;
		this.movie = movie;
		this.rating = rating;
		this.comment = comment;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getMovie() {
		return movie;
	}

	public void setMovie(Integer movie) {
		this.movie = movie;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserMovie [user=" + user + ", movie=" + movie + ", rating="
				+ rating + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		UserMovie other = (UserMovie) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
