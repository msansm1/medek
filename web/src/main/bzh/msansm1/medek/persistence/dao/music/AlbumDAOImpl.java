package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.music.Album;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class AlbumDAOImpl implements AlbumDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Album album) {
		template.persist(album);
		template.refresh(album);
		return album.getId();
	}

	@Override
	public void update(Album album) {
		template.merge(album);
	}

	@Override
	public void delete(Album album) {
		template.delete(album);
	}

	@Override
	public Album findAlbumById(Integer id) {
		return template.load(Album.class, id);
	}

	@Override
	public List<Album> findAlbumByTitle(String title) {
		return template.find("SELECT a FROM ALBUM a WHERE a.TITLE='"
				+ title + "'");
	}

	@Override
	public List<Album> findAlbumByGenreId(Integer id) {
		return template
				.find("SELECT a FROM ALBUM a WHERE a.GENRE='" + id
				+ "'");
	}

	@Override
	public List<Album> findAllAlbums() {
		return template.loadAll(Album.class);
	}

	@Override
	public List<Album> findAllAlbums(String filter, String sidx, String sord) {
		return template.find("SELECT a FROM ALBUM a " + filter + " ORDER BY a."
				+ sidx + " " + sord);
	}

}
