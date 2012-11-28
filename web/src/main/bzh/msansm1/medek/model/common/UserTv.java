package bzh.msansm1.medek.model.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for UserTv
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_user_tv")
public class UserTv implements Serializable{

	private static final long serialVersionUID = 4899789580710611898L;

	private Integer user;
	private Integer tvshow;
	private Integer rating;
	private String comment;

	public UserTv() {
		super();
	}

	public UserTv(Integer user, Integer tvshow, Integer rating, String comment) {
		super();
		this.user = user;
		this.tvshow = tvshow;
		this.rating = rating;
		this.comment = comment;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getTvshow() {
		return tvshow;
	}

	public void setTvshow(Integer tvshow) {
		this.tvshow = tvshow;
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
		return "UserTv [user=" + user + ", tvshow=" + tvshow + ", rating="
				+ rating + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((tvshow == null) ? 0 : tvshow.hashCode());
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
		UserTv other = (UserTv) obj;
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
		if (tvshow == null) {
			if (other.tvshow != null)
				return false;
		} else if (!tvshow.equals(other.tvshow))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
