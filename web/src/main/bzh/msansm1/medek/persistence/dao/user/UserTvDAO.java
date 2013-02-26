package bzh.msansm1.medek.persistence.dao.user;

import java.util.List;

import bzh.msansm1.medek.persistence.model.users.UserTv;

/**
 * UserTv table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface UserTvDAO {
	
	void create(UserTv userTv);
	
	void update(UserTv userTv);
	
	void delete(UserTv userTv);
	
	UserTv findUserTvById(Integer id);
	
	List<UserTv> findAllUserTv();

}
