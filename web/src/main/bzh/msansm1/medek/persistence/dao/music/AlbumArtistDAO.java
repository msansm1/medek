package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.AlbumArtist;

/**
 * AlbumArtistDAO table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface AlbumArtistDAO {
	
	void create(AlbumArtist albumArtist);
	
	void update(AlbumArtist albumArtist);
	
	void delete(AlbumArtist albumArtist);
	
	AlbumArtist findAlbumArtistById(Integer id);
	
	List<AlbumArtist> findAlbumArtistByArtistId(Integer id);
	
	List<AlbumArtist> findAllAlbumArtist();
	
	List<AlbumArtist> findAllAlbumArtist(String filter, String sidx, String sord);
}
