package bzh.msansm1.medek.persistence.dao.artist.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.dao.artist.ArtistDAO;
import bzh.msansm1.medek.persistence.dao.artist.ArtistTypeDAO;
import bzh.msansm1.medek.persistence.model.artist.Artist;
import bzh.msansm1.medek.persistence.model.artist.ArtistType;

/**
 * DAO proxy class for table Artist and relatives
 * 
 * @author sguinard
 * 
 */

@Component
public class ArtistProxyImpl implements ArtistProxy {

	@Autowired
	private ArtistDAO artistDao;

	@Autowired
	private ArtistTypeDAO artistTypeDao;

	@Override
	public Integer createArtist(Artist artist) {
		return artistDao.create(artist);
	}

	@Override
	public void updateArtist(Artist artist) {
		artistDao.update(artist);
	}

	@Override
	public void deleteArtist(Artist artist) {
		artistDao.delete(artist);
	}

	@Override
	public Artist getArtistById(Integer id) {
		return artistDao.findArtistById(id);
	}

	@Override
	public List<Artist> getArtistByName(String name) {
		return artistDao.findArtistByName(name);
	}

	@Override
	public List<Artist> getArtistByTypeId(Integer id) {
		return artistDao.findArtistByTypeId(id);
	}

	@Override
	public List<Artist> getAllArtist() {
		return artistDao.findAllArtist();
	}

	@Override
	public List<Artist> getAllArtist(String filter, String sidx, String sord) {
		return artistDao.findAllArtist(filter, sidx, sord);
	}

	@Override
	public void createArtistType(ArtistType artistType) {
		artistTypeDao.create(artistType);
	}

	@Override
	public void updateArtistType(ArtistType artistType) {
		artistTypeDao.update(artistType);
	}

	@Override
	public void deleteArtistType(ArtistType artistType) {
		artistTypeDao.delete(artistType);
	}

	@Override
	public ArtistType getArtistTypeById(Integer id) {
		return artistTypeDao.findArtistTypeById(id);
	}

	@Override
	public List<ArtistType> getAllArtistType() {
		return artistTypeDao.findAllArtistType();
	}

	@Override
	public List<ArtistType> getAllArtistType(String filter, String sidx,
			String sord) {
		return artistTypeDao.findAllArtistType(filter, sidx, sord);
	}

}
