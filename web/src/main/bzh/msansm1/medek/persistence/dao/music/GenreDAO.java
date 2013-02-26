package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.Genre;

/**
 * Genre table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface GenreDAO {
	
	Integer create(Genre genre);
	
	void update(Genre genre);
	
	void delete(Genre genre);
	
	Genre findGenreById(Integer id);
	
	List<Genre> findAllGenre();
	
	List<Genre> findAllGenre(String filter, String sidx, String sord);
	
}
