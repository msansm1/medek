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

import bzh.msansm1.medek.persistence.model.users.UserMovie;

@Component
public class UserMovieDAOImpl implements UserMovieDAO {

	@Autowired
	private HibernateTemplate template;


	@Override
	public void create(UserMovie userMovie) {
		template.persist(userMovie);
		template.refresh(userMovie);
	}

	@Override
	public void update(UserMovie userMovie) {
		template.merge(userMovie);
	}

	@Override
	public void delete(UserMovie userMovie) {
		template.delete(userMovie);
	}

	@Override
	public UserMovie findUserMovieById(Integer id) {
		return template.load(UserMovie.class, id);
	}

	@Override
	public List<UserMovie> findAllUserMovie() {
		return template.loadAll(UserMovie.class);
	}

}
