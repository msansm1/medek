package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.UserAlbum;

/**
 * UserAlbum table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface UserAlbumDAO {
	
	void create(UserAlbum userAlbum);
	
	void update(UserAlbum userAlbum);
	
	void delete(UserAlbum userAlbum);
	
	UserAlbum findUserAlbumById(Integer id);
	
	List<UserAlbum> findAllUserAlbum();

}
