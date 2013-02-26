package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.book.Collection;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class CollectionDAOImpl implements CollectionDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Collection collection) {
		template.persist(collection);
		template.refresh(collection);
		return collection.getId();
	}

	@Override
	public void update(Collection collection) {
		template.merge(collection);
	}

	@Override
	public void delete(Collection collection) {
		template.delete(collection);
	}

	@Override
	public Collection findCollectionById(Integer id) {
		return template.load(Collection.class, id);
	}

	@Override
	public List<Collection> findAllCollection() {
		return template.loadAll(Collection.class);
	}

}
