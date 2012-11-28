package bzh.msansm1.medek.model.users;

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
@Table(name = "med_friends")
public class Friend implements Serializable{

	private static final long serialVersionUID = -8623972915544397187L;

	private Integer user;
	private Integer friend;
	private Boolean isAccepted;

	public Friend() {
		super();
	}

	public Friend(Integer user, Integer friend, Boolean isAccepted) {
		super();
		this.user = user;
		this.friend = friend;
		this.isAccepted = isAccepted;
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
	@Override
	public String toString() {
		return "Friend [user=" + user + ", friend=" + friend + ", isAccepted="
				+ isAccepted + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((friend == null) ? 0 : friend.hashCode());
		result = prime * result
				+ ((isAccepted == null) ? 0 : isAccepted.hashCode());
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
