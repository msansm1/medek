package bzh.msansm1.medek.persistence.dao.tvshow;

/**
 * 
 * @author sguinard
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.tvshow.TvshowLang;

@Component
public class TvshowLangDAOImpl implements TvshowLangDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(TvshowLang tvshowLang) {
		template.persist(tvshowLang);
		template.refresh(tvshowLang);
	}

	@Override
	public void update(TvshowLang tvshowLang) {
		template.merge(tvshowLang);
	}

	@Override
	public void delete(TvshowLang tvshowLang) {
		template.delete(tvshowLang);
	}

	@Override
	public TvshowLang findTvshowLangById(Integer id) {
		return template.load(TvshowLang.class, id);
	}

	@Override
	public List<TvshowLang> findAllTvshowLang() {
		return template.loadAll(TvshowLang.class);
	}

}
