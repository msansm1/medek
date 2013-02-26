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

import bzh.msansm1.medek.persistence.model.tvshow.Tvshow;

@Component
public class TvshowDAOImpl implements TvshowDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Tvshow tvshow) {
		template.persist(tvshow);
		template.refresh(tvshow);
		return tvshow.getId();
	}

	@Override
	public void update(Tvshow tvshow) {
		template.merge(tvshow);
	}

	@Override
	public void delete(Tvshow tvshow) {
		template.delete(tvshow);
	}

	@Override
	public Tvshow findTvshowById(Integer id) {
		return template.load(Tvshow.class, id);
	}

	@Override
	public List<Tvshow> findAllTvshow() {
		return template.loadAll(Tvshow.class);
	}

}
