package bzh.msansm1.medek.persistence.dao.user;

/** * 
 * @author sguinard
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.users.Friend;

@Component
public class FriendDAOImpl implements FriendDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(Friend friend) {
		template.persist(friend);
		template.refresh(friend);
	}

	@Override
	public void update(Friend friend) {
		template.merge(friend);
	}

	@Override
	public void delete(Friend friend) {
		template.delete(friend);
	}

	@Override
	public List<Friend> findFriendByUserId(int userId) {
		return template.find("SELECT f FROM FRIEND f WHERE f.USER='" + userId
				+ "'");
	}

	@Override
	public List<Friend> findAllFriend() {
		return template.loadAll(Friend.class);
	}

	@Override
	public List<Friend> findAllFriend(String filter, String sidx, String sord) {
		return template.find("SELECT f FROM FRIEND f " + filter
				+ " ORDER BY f." + sidx + " " + sord);
	}

}
