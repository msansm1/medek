package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import bzh.msansm1.medek.persistence.model.movie.MovieLang;

/**
 * MovieLang table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface MovieLangDAO {

	void create(MovieLang movieLang);

	void update(MovieLang movieLang);

	void delete(MovieLang movieLang);

	List<MovieLang> findMovieLangByMovieId(Integer id);

	List<MovieLang> findMovieLangByLangId(Integer id);

	List<MovieLang> findAllMovieLang();

}
