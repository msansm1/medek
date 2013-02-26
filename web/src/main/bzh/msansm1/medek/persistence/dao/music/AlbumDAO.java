package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.Album;

/**
 * ALBUM table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface AlbumDAO {
	
	Integer create(Album album);
	
	void update(Album album);
	
	void delete(Album album);
	
	Album findAlbumById(Integer id);

	List<Album> findAlbumByTitle(String title);

	List<Album> findAlbumByGenreId(Integer id);
	
	List<Album> findAllAlbums();
	
	List<Album> findAllAlbums(String filter, String sidx, String sord);

}
