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

import bzh.msansm1.medek.persistence.model.tvshow.TvshowSubtitle;

@Component
public class TvshowSubtitleDAOImpl implements TvshowSubtitleDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(TvshowSubtitle tvshowSubtitle) {
		template.persist(tvshowSubtitle);
		template.refresh(tvshowSubtitle);
	}

	@Override
	public void update(TvshowSubtitle tvshowSubtitle) {
		template.merge(tvshowSubtitle);
	}

	@Override
	public void delete(TvshowSubtitle tvshowSubtitle) {
		template.delete(tvshowSubtitle);
	}

	@Override
	public TvshowSubtitle findTvshowSubtitleById(Integer id) {
		return template.load(TvshowSubtitle.class, id);
	}

	@Override
	public List<TvshowSubtitle> findAllTvshowSubtitle() {
		return template.loadAll(TvshowSubtitle.class);
	}

}
