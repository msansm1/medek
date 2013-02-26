package bzh.msansm1.medek.persistence.dao.user;

/**
 * 
 * @author sguinard
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.users.User;

@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(User user) {
		template.persist(user);
		template.refresh(user);
		return user.getId();
	}

	@Override
	public void update(User user) {
		template.merge(user);
	}

	@Override
	public void delete(User user) {
		template.delete(user);
	}

	@Override
	public User findUserById(Integer id) {
		return template.load(User.class, id);
	}

	@Override
	public List<User> findUserByLogin(String login) {
		return template.find("SELECT u FROM User u WHERE u.login='" + login
				+ "'");
	}

	@Override
	public List<User> findAllUser() {
		return template.loadAll(User.class);
	}

	@Override
	public List<User> findAllUser(String filter, String sidx, String sord) {
		return template.find("SELECT u FROM USER u " + filter
				+ " ORDER BY u." + sidx + " " + sord);
	}

}
