package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.User;

/**
 * User table DAO class interface.
 * 
 * @author rbarbot
 *
 */

public interface UserDAO {
	
	Integer create(User user);
	
	void update(User user);
	
	void delete(User user);
	
	User findUserById(Integer id);
	
	List<User> findUserByLogin(String login);
	
	List<User> findAllUser();

	List<User> findAllUser(String filter, String sidx, String sord);

}
