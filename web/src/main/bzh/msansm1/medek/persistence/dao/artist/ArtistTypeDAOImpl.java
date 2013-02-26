package bzh.msansm1.medek.persistence.dao.artist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.artist.ArtistType;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class ArtistTypeDAOImpl implements ArtistTypeDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(ArtistType artistType) {
		template.persist(artistType);
		template.refresh(artistType);
		return artistType.getId();
	}

	@Override
	public void update(ArtistType artistType) {
		template.merge(artistType);
	}

	@Override
	public void delete(ArtistType artistType) {
		template.delete(artistType);
	}

	@Override
	public ArtistType findArtistTypeById(Integer id) {
		return template.load(ArtistType.class, id);
	}

	@Override
	public List<ArtistType> findAllArtistType() {
		return template.loadAll(ArtistType.class);
	}

	@Override
	public List<ArtistType> findAllArtistType(String filter, String sidx,
			String sord) {
		return template.find("SELECT at FROM ARTIST at " + filter
				+ " ORDER BY at." + sidx + " " + sord);
	}

}
