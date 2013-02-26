package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.movie.Movie;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Movie movie) {
		template.persist(movie);
		template.refresh(movie);
		return movie.getId();
	}

	@Override
	public void update(Movie movie) {
		template.merge(movie);
	}

	@Override
	public void delete(Movie movie) {
		template.delete(movie);
	}

	@Override
	public Movie findMovieById(Integer id) {
		return template.load(Movie.class, id);
	}

	@Override
	public List<Movie> findAllMovie() {
		return template.loadAll(Movie.class);
	}

}
