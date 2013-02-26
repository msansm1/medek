package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import bzh.msansm1.medek.persistence.model.common.Database;

/**
 * Database table DAO class interface.
 * 
 * @author rbarbot
 *
 */
public interface DatabaseDAO {
	
	List<Database> findAllDatabase();

}
