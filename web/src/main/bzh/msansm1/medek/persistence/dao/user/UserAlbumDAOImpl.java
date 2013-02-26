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

import bzh.msansm1.medek.persistence.model.users.UserAlbum;

@Component
public class UserAlbumDAOImpl implements UserAlbumDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(UserAlbum userAlbum) {
		template.persist(userAlbum);
		template.refresh(userAlbum);
	}

	@Override
	public void update(UserAlbum userAlbum) {
		template.merge(userAlbum);
	}

	@Override
	public void delete(UserAlbum userAlbum) {
		template.delete(userAlbum);
	}

	@Override
	public UserAlbum findUserAlbumById(Integer id) {
		return template.load(UserAlbum.class, id);
	}

	@Override
	public List<UserAlbum> findAllUserAlbum() {
		return template.loadAll(UserAlbum.class);
	}

}
