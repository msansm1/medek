package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.UserBook;

/**
 * UserBook table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface UserBookDAO {
	
	void create(UserBook userBook);
	
	void update(UserBook userBook);
	
	void delete(UserBook userBook);
	
	UserBook findUserBookById(Integer id);
	
	List<UserBook> findAllUserBook();

}
