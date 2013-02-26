package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import bzh.msansm1.medek.persistence.model.movie.MovieSubtitle;

/**
 * MovieSubtitle table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface MovieSubtitleDAO {

	void create(MovieSubtitle movieSubtitle);

	void update(MovieSubtitle movieSubtitle);

	void delete(MovieSubtitle movieSubtitle);

	List<MovieSubtitle> findMovieSubtitleByMovieId(Integer id);

	List<MovieSubtitle> findMovieSubtitleBySubtitleId(Integer id);

	List<MovieSubtitle> findAllMovieSubtitle();

}
