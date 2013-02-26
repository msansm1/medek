package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import bzh.msansm1.medek.persistence.model.common.Support;

/**
 * Support table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface SupportDAO {

	Integer create(Support support);

	void update(Support support);

	void delete(Support support);

	Support findSupportById(Integer id);

	List<Support> findAllSupport();

}
