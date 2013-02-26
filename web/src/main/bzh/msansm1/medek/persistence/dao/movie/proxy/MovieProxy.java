package bzh.msansm1.medek.persistence.dao.movie.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.movie.Movie;
import bzh.msansm1.medek.persistence.model.movie.MovieArtist;
import bzh.msansm1.medek.persistence.model.movie.MovieLang;
import bzh.msansm1.medek.persistence.model.movie.MovieSubtitle;

/**
 * DAO proxy class interface for table Movie and relatives
 * 
 * @author sguinard
 * 
 */

public interface MovieProxy {

	// MovieArtist
	void createMovieArtist(MovieArtist movieArtist);

	void updateMovieArtist(MovieArtist movieArtist);

	void deleteMovieArtist(MovieArtist movieArtist);

	List<MovieArtist> getMovieArtistByMovieId(Integer id);

	List<MovieArtist> getMovieArtistByArtistId(Integer id);

	List<MovieArtist> getAllMovieArtist();

	// Movie
	Integer createMovie(Movie movie);

	void updateMovie(Movie movie);

	void deleteMovie(Movie movie);

	Movie getMovieById(Integer id);

	List<Movie> getAllMovie();

	// MovieLang
	void createMovieLang(MovieLang movieLang);

	void updateMovieLang(MovieLang movieLang);

	void deleteMovieLang(MovieLang movieLang);

	List<MovieLang> getMovieLangByMovieId(Integer id);

	List<MovieLang> getMovieLangByLangId(Integer id);

	List<MovieLang> getAllMovieLang();

	// MovieSubtitle
	void createMovieSubtitle(MovieSubtitle movieSubtitle);

	void updateMovieSubtitle(MovieSubtitle movieSubtitle);

	void deleteMovieSubtitle(MovieSubtitle movieSubtitle);

	List<MovieSubtitle> getMovieSubtitleByMovieId(Integer id);

	List<MovieSubtitle> getMovieSubtitleBySubtitleId(Integer id);

	List<MovieSubtitle> getAllMovieSubtitle();

}
