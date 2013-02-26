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

import bzh.msansm1.medek.persistence.model.users.UserTv;

@Component
public class UserTvDAOImpl implements UserTvDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(UserTv userTv) {
		template.persist(userTv);
		template.refresh(userTv);
	}

	@Override
	public void update(UserTv userTv) {
		template.merge(userTv);
	}

	@Override
	public void delete(UserTv userTv) {
		template.delete(userTv);
	}

	@Override
	public UserTv findUserTvById(Integer id) {
		return template.load(UserTv.class, id);
	}

	@Override
	public List<UserTv> findAllUserTv() {
		return template.loadAll(UserTv.class);
	}

}
