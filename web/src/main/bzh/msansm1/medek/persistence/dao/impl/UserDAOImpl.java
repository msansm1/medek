package bzh.msansm1.medek.persistence.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.dao.UserDAO;
import bzh.msansm1.medek.persistence.model.User;

/**
 * Implementation class of user DAO interface.
 * The annotations "component" and "autowired" are from Spring.
 * 
 * @author rbarbot
 *
 */
@Component
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(User user) {
		template.persist(user);
		template.refresh(user);
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
	public List<User> findAll() {
		return template.loadAll(User.class);
	}

	@Override
	public User findById(Integer id) {
		return template.load(User.class, id);
	}

	@Override
	public List<Object[]> findByLogin(String login) {
		return template.find("SELECT u.id, u.lastName, u.firstName, u.email, "+
				"u.login, u.password FROM User u WHERE u.login='"+login+"'");
	}

	@Override
	public List<Object[]> findAll(String filter, String sidx, String sord) {
		return template.find("SELECT u.id, u.lastName, u.firstName, u.email, "+
				"u.login FROM User u "+filter+" ORDER BY u."+sidx+" "+sord);
	}
}
