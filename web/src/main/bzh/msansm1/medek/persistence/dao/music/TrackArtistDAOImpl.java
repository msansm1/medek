package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.music.TrackArtist;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class TrackArtistDAOImpl implements TrackArtistDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(TrackArtist trackArtist) {
		template.persist(trackArtist);
		template.refresh(trackArtist);
	}

	@Override
	public void update(TrackArtist trackArtist) {
		template.merge(trackArtist);
	}

	@Override
	public void delete(TrackArtist trackArtist) {
		template.delete(trackArtist);
	}

	@Override
	public TrackArtist findTrackArtistById(Integer id) {
		return template.load(TrackArtist.class, id);
	}

	@Override
	public List<TrackArtist> findTrackArtistByArtistId(Integer id) {
		return template.find("SELECT ta FROM TRACKARTIST a WHERE a.ARTIST='"
				+ id + "'");
	}

	@Override
	public List<TrackArtist> findAllTrackArtist() {
		return template.loadAll(TrackArtist.class);
	}

	@Override
	public List<TrackArtist> findAllTrackArtist(String filter, String sidx,
			String sord) {
		return template.find("SELECT ta FROM TRACKARTIST ta " + filter
				+ " ORDER BY ta." + sidx + " " + sord);
	}

}
