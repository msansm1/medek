package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import bzh.msansm1.medek.persistence.model.common.Lang;

/**
 * Lang table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface LangDAO {

	Integer create(Lang lang);

	void update(Lang lang);

	void delete(Lang lang);

	Lang findLangById(Integer id);

	List<Lang> findAllLang();

}
