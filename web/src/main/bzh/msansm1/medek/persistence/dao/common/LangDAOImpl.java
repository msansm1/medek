package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.common.Lang;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class LangDAOImpl implements LangDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Lang lang) {
		template.persist(lang);
		template.refresh(lang);
		return lang.getId();
	}

	@Override
	public void update(Lang lang) {
		template.merge(lang);
	}

	@Override
	public void delete(Lang lang) {
		template.delete(lang);
	}

	@Override
	public Lang findLangById(Integer id) {
		return template.load(Lang.class, id);
	}

	@Override
	public List<Lang> findAllLang() {
		return template.loadAll(Lang.class);
	}

}
