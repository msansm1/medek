package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.common.Database;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class DatabaseDAOImpl implements DatabaseDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public List<Database> findAllDatabase() {
		return template.loadAll(Database.class);
	}

}
