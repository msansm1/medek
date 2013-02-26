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

import bzh.msansm1.medek.persistence.model.users.UserBook;

@Component
public class UserBookDAOImpl implements UserBookDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(UserBook userBook) {
		template.persist(userBook);
		template.refresh(userBook);
	}

	@Override
	public void update(UserBook userBook) {
		template.merge(userBook);
	}

	@Override
	public void delete(UserBook userBook) {
		template.delete(userBook);
	}

	@Override
	public UserBook findUserBookById(Integer id) {
		return template.load(UserBook.class, id);
	}

	@Override
	public List<UserBook> findAllUserBook() {
		return template.loadAll(UserBook.class);
	}

}
