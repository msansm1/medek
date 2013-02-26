package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import bzh.msansm1.medek.persistence.model.movie.MovieArtist;

/**
 * MovieArtist table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface MovieArtistDAO {

	void create(MovieArtist movieArtist);

	void update(MovieArtist movieArtist);

	void delete(MovieArtist movieArtist);

	List<MovieArtist> findMovieArtistByMovieId(Integer id);

	List<MovieArtist> findMovieArtistByArtistId(Integer id);

	List<MovieArtist> findAllMovieArtist();

}
