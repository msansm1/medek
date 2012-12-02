package bzh.msansm1.medek.persistence.model.users;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity class for Friend
 * 
 * @author sguinard
 *
 */

@Entity
@Table(name = "FRIEND")
public class Friend implements Serializable{

	private static final long serialVersionUID = -8623972915544397187L;

	private Integer user;
	private Integer friend;
	private Boolean isAccepted;
	private Boolean isSharedCollection;

	public Friend() {
		super();
	}

	public Friend(Integer user, Integer friend, Boolean isAccepted,
			Boolean isSharedCollection) {
		super();
		this.user = user;
		this.friend = friend;
		this.isAccepted = isAccepted;
		this.isSharedCollection = isSharedCollection;
	}

	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getFriend() {
		return friend;
	}
	public void setFriend(Integer friend) {
		this.friend = friend;
	}
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public Boolean getIsSharedCollection() {
		return isSharedCollection;
	}

	public void setIsSharedCollection(Boolean isSharedCollection) {
		this.isSharedCollection = isSharedCollection;
	}

	@Override
	public String toString() {
		return "Friend [user=" + user + ", friend=" + friend + ", isAccepted="
				+ isAccepted + ", isSharedCollection=" + isSharedCollection
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((friend == null) ? 0 : friend.hashCode());
		result = prime * result
				+ ((isAccepted == null) ? 0 : isAccepted.hashCode());
		result = prime
				* result
				+ ((isSharedCollection == null) ? 0 : isSharedCollection
						.hashCode());
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
		Friend other = (Friend) obj;
		if (friend == null) {
			if (other.friend != null)
				return false;
		} else if (!friend.equals(other.friend))
			return false;
		if (isAccepted == null) {
			if (other.isAccepted != null)
				return false;
		} else if (!isAccepted.equals(other.isAccepted))
			return false;
		if (isSharedCollection == null) {
			if (other.isSharedCollection != null)
				return false;
		} else if (!isSharedCollection.equals(other.isSharedCollection))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
