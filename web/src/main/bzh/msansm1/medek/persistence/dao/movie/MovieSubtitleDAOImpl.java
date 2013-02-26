package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.movie.MovieSubtitle;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class MovieSubtitleDAOImpl implements MovieSubtitleDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(MovieSubtitle movieSubtitle) {
		template.persist(movieSubtitle);
		template.refresh(movieSubtitle);
	}

	@Override
	public void update(MovieSubtitle movieSubtitle) {
		template.merge(movieSubtitle);
	}

	@Override
	public void delete(MovieSubtitle movieSubtitle) {
		template.delete(movieSubtitle);
	}

	@Override
	public List<MovieSubtitle> findMovieSubtitleByMovieId(Integer id) {
		return template.find("SELECT ms FROM MOVIESUBTITLE ms WHERE ms.MOVIE='"
				+ id + "'");
	}

	@Override
	public List<MovieSubtitle> findMovieSubtitleBySubtitleId(Integer id) {
		return template
				.find("SELECT ms FROM MOVIESUBTITLE ms WHERE ms.SUBTITLE='"
						+ id + "'");
	}

	@Override
	public List<MovieSubtitle> findAllMovieSubtitle() {
		return template.loadAll(MovieSubtitle.class);
	}

}
