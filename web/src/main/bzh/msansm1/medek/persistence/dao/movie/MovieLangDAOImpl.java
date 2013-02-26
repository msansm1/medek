package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.movie.MovieLang;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class MovieLangDAOImpl implements MovieLangDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(MovieLang movieLang) {
		template.persist(movieLang);
		template.refresh(movieLang);
	}

	@Override
	public void update(MovieLang movieLang) {
		template.merge(movieLang);
	}

	@Override
	public void delete(MovieLang movieLang) {
		template.delete(movieLang);
	}

	@Override
	public List<MovieLang> findMovieLangByMovieId(Integer id) {
		return template.find("SELECT ml FROM MOVIELANG ml WHERE ml.MOVIE='"
				+ id
				+ "'");
	}

	@Override
	public List<MovieLang> findMovieLangByLangId(Integer id) {
		return template.find("SELECT ml FROM MOVIELANG ml WHERE ml.LANG='" + id
				+ "'");
	}

	@Override
	public List<MovieLang> findAllMovieLang() {
		return template.loadAll(MovieLang.class);
	}

}
