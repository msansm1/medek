package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.UserMovie;

/**
 * UserMovie table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface UserMovieDAO {
	
	void create(UserMovie userMovie);
	
	void update(UserMovie userMovie);
	
	void delete(UserMovie userMovie);
	
	UserMovie findUserMovieById(Integer id);
	
	List<UserMovie> findAllUserMovie();

}
