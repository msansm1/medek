package bzh.msansm1.medek.persistence.dao;

import java.util.List;

import bzh.msansm1.medek.persistence.model.Database;

/**
 * Database table DAO class interface.
 * 
 * @author rbarbot
 *
 */
public interface DatabaseDAO {
	
	List<Database> findAll();

}
