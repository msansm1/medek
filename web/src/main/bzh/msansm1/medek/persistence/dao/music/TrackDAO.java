package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.Track;

/**
 * Track table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface TrackDAO {
	
	Integer create(Track track);
	
	void update(Track track);
	
	void delete(Track track);
	
	Track findTrackById(Integer id);
	
	List<Track> findTrackByAlbumId(Integer id);
	
	List<Track> findTrackBytitle(String title);
	
	List<Track> findAllTrack();
	
	List<Track> findAllTrack(String filter, String sidx, String sord);
	
}
