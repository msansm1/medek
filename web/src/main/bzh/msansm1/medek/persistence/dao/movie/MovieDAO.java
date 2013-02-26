package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import bzh.msansm1.medek.persistence.model.movie.Movie;

/**
 * Movie table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface MovieDAO {

	Integer create(Movie movie);

	void update(Movie movie);

	void delete(Movie movie);

	Movie findMovieById(Integer id);

	List<Movie> findAllMovie();

}
