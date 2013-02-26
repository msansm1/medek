package bzh.msansm1.medek.persistence.dao.artist;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.artist.Artist;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class ArtistDAOImpl implements ArtistDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Artist artist) {
		template.persist(artist);
		template.refresh(artist);
		return artist.getId();
	}

	@Override
	public void update(Artist artist) {
		template.merge(artist);
	}

	@Override
	public void delete(Artist artist) {
		template.delete(artist);
	}

	@Override
	public Artist findArtistById(Integer id) {
		return template.load(Artist.class, id);
	}

	@Override
	public List<Artist> findArtistByName(String name) {
		return template.find("SELECT a FROM ARTIST a WHERE a.NAME='" + name
				+ "'");
	}

	@Override
	public List<Artist> findAllArtist() {
		return template.loadAll(Artist.class);
	}

	@Override
	public List<Artist> findAllArtist(String filter, String sidx, String sord) {
		return template.find("SELECT a FROM ARTIST a " + filter
				+ " ORDER BY a." + sidx + " " + sord);
	}

	@Override
	public List<Artist> findArtistByTypeId(Integer id) {
		return template
				.find("SELECT a FROM ARTIST a WHERE a.TYPE='" + id
				+ "'");
	}

}
