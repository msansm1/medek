package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.music.Track;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class TrackDAOImpl implements TrackDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Track track) {
		template.persist(track);
		template.refresh(track);
		return track.getId();
	}

	@Override
	public void update(Track track) {
		template.merge(track);
	}

	@Override
	public void delete(Track track) {
		template.delete(track);
	}

	@Override
	public Track findTrackById(Integer id) {
		return template.load(Track.class, id);
	}

	@Override
	public List<Track> findTrackByAlbumId(Integer id) {
		return template
				.find("SELECT a FROM TRACK a WHERE a.ALBUM='" + id
				+ "'");
	}

	@Override
	public List<Track> findTrackBytitle(String title) {
		return template
.find("SELECT a FROM TRACK a WHERE a.TITLE='" + title
				+ "'");
	}

	@Override
	public List<Track> findAllTrack() {
		return template.loadAll(Track.class);
	}

	@Override
	public List<Track> findAllTrack(String filter, String sidx, String sord) {
		return template.find("SELECT t FROM TRACK t " + filter
				+ " ORDER BY t."
				+ sidx + " " + sord);
	}

}
