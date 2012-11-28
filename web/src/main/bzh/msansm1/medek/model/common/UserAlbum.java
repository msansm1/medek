package bzh.msansm1.medek.model.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for UserAlbum
 * 
 * @author sguinard
 * 
 */

@Entity
@Table(name = "med_user_album")
public class UserAlbum implements Serializable{

	private static final long serialVersionUID = 3072837267412920144L;

	private Integer user;
	private Integer album;
	private Integer rating;
	private String comment;

	public UserAlbum() {
		super();
	}

	public UserAlbum(Integer user, Integer album, Integer rating, String comment) {
		super();
		this.user = user;
		this.album = album;
		this.rating = rating;
		this.comment = comment;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getAlbum() {
		return album;
	}

	public void setAlbum(Integer album) {
		this.album = album;
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
		return "UserAlbum [user=" + user + ", album=" + album + ", rating="
				+ rating + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((album == null) ? 0 : album.hashCode());
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
		UserAlbum other = (UserAlbum) obj;
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
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
