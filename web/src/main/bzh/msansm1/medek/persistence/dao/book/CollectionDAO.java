package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.Collection;

/**
 * Collection table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface CollectionDAO {

	Integer create(Collection collection);

	void update(Collection collection);

	void delete(Collection collection);

	Collection findCollectionById(Integer id);

	List<Collection> findAllCollection();

}
