package bzh.msansm1.medek.persistence.dao.artist;

import java.util.List;

import bzh.msansm1.medek.persistence.model.artist.ArtistType;

/**
 * AlbumType table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface ArtistTypeDAO {
	
	Integer create(ArtistType artistType);
	
	void update(ArtistType artistType);
	
	void delete(ArtistType artistType);
	
	ArtistType findArtistTypeById(Integer id);
	
	List<ArtistType> findAllArtistType();
	
	List<ArtistType> findAllArtistType(String filter, String sidx, String sord);
}
