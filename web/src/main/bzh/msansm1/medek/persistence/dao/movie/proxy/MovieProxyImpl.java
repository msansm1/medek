package bzh.msansm1.medek.persistence.dao.movie.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.movie.MovieArtistDAO;
import bzh.msansm1.medek.persistence.dao.movie.MovieDAO;
import bzh.msansm1.medek.persistence.dao.movie.MovieLangDAO;
import bzh.msansm1.medek.persistence.dao.movie.MovieSubtitleDAO;
import bzh.msansm1.medek.persistence.model.movie.Movie;
import bzh.msansm1.medek.persistence.model.movie.MovieArtist;
import bzh.msansm1.medek.persistence.model.movie.MovieLang;
import bzh.msansm1.medek.persistence.model.movie.MovieSubtitle;

/**
 * DAO proxy class for table Movie and relatives
 * 
 * @author sguinard
 * 
 */

public class MovieProxyImpl implements MovieProxy {

	@Autowired
	private MovieArtistDAO movieArtistDao;

	@Autowired
	private MovieDAO movieDao;

	@Autowired
	private MovieLangDAO movieLangDao;

	@Autowired
	private MovieSubtitleDAO movieSubtitleDao;

	@Override
	public void createMovieArtist(MovieArtist movieArtist) {
		movieArtistDao.create(movieArtist);
	}

	@Override
	public void updateMovieArtist(MovieArtist movieArtist) {
		movieArtistDao.update(movieArtist);
	}

	@Override
	public void deleteMovieArtist(MovieArtist movieArtist) {
		movieArtistDao.delete(movieArtist);
	}

	@Override
	public List<MovieArtist> getMovieArtistByMovieId(Integer id) {
		return movieArtistDao.findMovieArtistByMovieId(id);
	}

	@Override
	public List<MovieArtist> getMovieArtistByArtistId(Integer id) {
		return movieArtistDao.findMovieArtistByArtistId(id);
	}

	@Override
	public List<MovieArtist> getAllMovieArtist() {
		return movieArtistDao.findAllMovieArtist();
	}

	@Override
	public Integer createMovie(Movie movie) {
		return movieDao.create(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
		movieDao.update(movie);
	}

	@Override
	public void deleteMovie(Movie movie) {
		movieDao.delete(movie);
	}

	@Override
	public Movie getMovieById(Integer id) {
		return movieDao.findMovieById(id);
	}

	@Override
	public List<Movie> getAllMovie() {
		return movieDao.findAllMovie();
	}

	@Override
	public void createMovieLang(MovieLang movieLang) {
		movieLangDao.create(movieLang);
	}

	@Override
	public void updateMovieLang(MovieLang movieLang) {
		movieLangDao.update(movieLang);
	}

	@Override
	public void deleteMovieLang(MovieLang movieLang) {
		movieLangDao.delete(movieLang);
	}

	@Override
	public List<MovieLang> getMovieLangByMovieId(Integer id) {
		return movieLangDao.findMovieLangByMovieId(id);
	}

	@Override
	public List<MovieLang> getMovieLangByLangId(Integer id) {
		return movieLangDao.findMovieLangByLangId(id);
	}

	@Override
	public List<MovieLang> getAllMovieLang() {
		return movieLangDao.findAllMovieLang();
	}

	@Override
	public void createMovieSubtitle(MovieSubtitle movieSubtitle) {
		movieSubtitleDao.create(movieSubtitle);
	}

	@Override
	public void updateMovieSubtitle(MovieSubtitle movieSubtitle) {
		movieSubtitleDao.update(movieSubtitle);
	}

	@Override
	public void deleteMovieSubtitle(MovieSubtitle movieSubtitle) {
		movieSubtitleDao.delete(movieSubtitle);
	}

	@Override
	public List<MovieSubtitle> getMovieSubtitleByMovieId(Integer id) {
		return movieSubtitleDao.findMovieSubtitleByMovieId(id);
	}

	@Override
	public List<MovieSubtitle> getMovieSubtitleBySubtitleId(Integer id) {
		return movieSubtitleDao.findMovieSubtitleBySubtitleId(id);
	}

	@Override
	public List<MovieSubtitle> getAllMovieSubtitle() {
		return movieSubtitleDao.findAllMovieSubtitle();
	}

}
