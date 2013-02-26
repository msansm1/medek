package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.music.AlbumArtist;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class AlbumArtistDAOImpl implements AlbumArtistDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(AlbumArtist albumArtist) {
		template.persist(albumArtist);
		template.refresh(albumArtist);
	}

	@Override
	public void update(AlbumArtist albumArtist) {
		template.merge(albumArtist);
	}

	@Override
	public void delete(AlbumArtist albumArtist) {
		template.delete(albumArtist);
	}

	@Override
	public AlbumArtist findAlbumArtistById(Integer id) {
		return template.load(AlbumArtist.class, id);
	}

	@Override
	public List<AlbumArtist> findAlbumArtistByArtistId(Integer id) {
		return template.find("SELECT aa FROM ALBUMARTIST aa WHERE aa.ARTIST='"
				+ id + "'");
	}

	@Override
	public List<AlbumArtist> findAllAlbumArtist() {
		return template.loadAll(AlbumArtist.class);
	}

	@Override
	public List<AlbumArtist> findAllAlbumArtist(String filter, String sidx,
			String sord) {
		return template.find("SELECT aa FROM ALBUMARTIST aa " + filter
				+ " ORDER BY aa." + sidx + " " + sord);
	}
}
