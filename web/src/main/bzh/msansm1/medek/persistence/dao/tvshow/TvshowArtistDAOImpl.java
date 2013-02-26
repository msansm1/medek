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

import bzh.msansm1.medek.persistence.model.tvshow.TvshowArtist;

@Component
public class TvshowArtistDAOImpl implements TvshowArtistDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(TvshowArtist tvshowArtist) {
		template.persist(tvshowArtist);
		template.refresh(tvshowArtist);
	}

	@Override
	public void update(TvshowArtist tvshowArtist) {
		template.merge(tvshowArtist);
	}

	@Override
	public void delete(TvshowArtist tvshowArtist) {
		template.delete(tvshowArtist);
	}

	@Override
	public TvshowArtist findTvshowArtistById(Integer id) {
		return template.load(TvshowArtist.class, id);
	}

	@Override
	public List<TvshowArtist> findAllTvshowArtist() {
		return template.loadAll(TvshowArtist.class);
	}

}
