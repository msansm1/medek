package bzh.msansm1.medek.persistence.dao.artist.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.artist.Artist;
import bzh.msansm1.medek.persistence.model.artist.ArtistType;

/**
 * DAO proxy class interface for table Artist and relatives
 * 
 * @author sguinard
 * 
 */

public interface ArtistProxy {

	// Artist
	Integer createArtist(Artist artist);

	void updateArtist(Artist artist);

	void deleteArtist(Artist artist);

	Artist getArtistById(Integer id);

	List<Artist> getArtistByName(String name);

	List<Artist> getArtistByTypeId(Integer id);

	List<Artist> getAllArtist();

	List<Artist> getAllArtist(String filter, String sidx, String sord);

	// ArtistType
	void createArtistType(ArtistType artistType);

	void updateArtistType(ArtistType artistType);

	void deleteArtistType(ArtistType artistType);

	ArtistType getArtistTypeById(Integer id);

	List<ArtistType> getAllArtistType();

	List<ArtistType> getAllArtistType(String filter, String sidx, String sord);

}
