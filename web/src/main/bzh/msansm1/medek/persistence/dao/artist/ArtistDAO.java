package bzh.msansm1.medek.persistence.dao.artist;

import java.util.List;

import bzh.msansm1.medek.persistence.model.artist.Artist;

/**
 * Artist table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface ArtistDAO {
	
	Integer create(Artist artist);
	
	void update(Artist artist);
	
	void delete(Artist artist);
	
	Artist findArtistById(Integer id);
	
	List<Artist> findArtistByName(String name);
	
	List<Artist> findArtistByTypeId(Integer id);
	
	List<Artist> findAllArtist();

	List<Artist> findAllArtist(String filter, String sidx, String sord);

}
