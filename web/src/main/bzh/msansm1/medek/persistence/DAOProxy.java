package bzh.msansm1.medek.persistence;

import java.util.Collection;
import java.util.List;

import bzh.msansm1.medek.persistence.model.User;

/**
 * Example of DAO proxy class interface.
 * Having only one class is not recommended, but not too many.
 * 
 * @author rbarbot
 *
 */
public interface DAOProxy {
	
	String getDatabaseVersion();
	
	User getUserById(Integer id);
	
	User getUserByLogin(String login);
	
	Collection<User> getAllUsers();
	
	void createUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);

	List<User> getAllUsers(String filter, String sidx, String sord);

}
