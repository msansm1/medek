package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.TrackArtist;

/**
 * TrackArtist table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface TrackArtistDAO {
	
	void create(TrackArtist trackArtist);
	
	void update(TrackArtist trackArtist);
	
	void delete(TrackArtist trackArtist);
	
	TrackArtist findTrackArtistById(Integer id);
	
	List<TrackArtist> findTrackArtistByArtistId(Integer id);
	
	List<TrackArtist> findAllTrackArtist();
	
	List<TrackArtist> findAllTrackArtist(String filter, String sidx, String sord);
}
