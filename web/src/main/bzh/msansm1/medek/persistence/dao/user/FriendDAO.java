package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.Friend;

/**
 * Friend table DAO class interface.
 * 
 * @author sguinard
 *
 */
public interface FriendDAO {
	
	void create(Friend friend);
	
	void update(Friend friend);
	
	void delete(Friend friend);
	
	List<Friend> findFriendByUserId(int userId);
	
	List<Friend> findAllFriend();

	List<Friend> findAllFriend(String filter, String sidx, String sord);

}
