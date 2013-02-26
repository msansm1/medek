package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.common.Support;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class SupportDAOImpl implements SupportDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Support support) {
		template.persist(support);
		template.refresh(support);
		return support.getId();
	}

	@Override
	public void update(Support support) {
		template.merge(support);
	}

	@Override
	public void delete(Support support) {
		template.delete(support);
	}

	@Override
	public Support findSupportById(Integer id) {
		return template.load(Support.class, id);
	}

	@Override
	public List<Support> findAllSupport() {
		return template.loadAll(Support.class);
	}

}
