package bzh.msansm1.medek.persistence.dao.music.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.music.Album;
import bzh.msansm1.medek.persistence.model.music.AlbumArtist;
import bzh.msansm1.medek.persistence.model.music.Genre;
import bzh.msansm1.medek.persistence.model.music.Track;
import bzh.msansm1.medek.persistence.model.music.TrackArtist;

/**
 * DAO proxy class interface for table Music and relatives
 * 
 * @author sguinard
 * 
 */

public interface MusicProxy {

	// AlbumArtist
	void createAlbumArtist(AlbumArtist albumArtist);

	void updateAlbumArtist(AlbumArtist albumArtist);

	void deleteAlbumArtist(AlbumArtist albumArtist);

	AlbumArtist getAlbumArtistById(Integer id);

	List<AlbumArtist> getAlbumArtistByArtistId(Integer id);

	List<AlbumArtist> getAllAlbumArtist();

	// Album
	Integer createAlbum(Album album);

	void updateAlbum(Album album);

	void deleteAlbum(Album album);

	Album getAlbumById(Integer id);

	List<Album> getAlbumByTitle(String title);

	List<Album> getAlbumByGenreId(Integer id);

	List<Album> getAllAlbums();

	// Genre
	Integer createGenre(Genre genre);

	void updateGenre(Genre genre);

	void deleteGenre(Genre genre);

	Genre getGenreById(Integer id);

	List<Genre> getAllGenre();

	// TrackArtist
	void createTrackArtist(TrackArtist trackArtist);

	void updateTrackArtist(TrackArtist trackArtist);

	void deleteTrackArtist(TrackArtist trackArtist);

	TrackArtist getTrackArtistById(Integer id);

	List<TrackArtist> getTrackArtistByArtistId(Integer id);

	List<TrackArtist> getAllTrackArtist();

	List<TrackArtist> getAllTrackArtist(String filter, String sidx, String sord);

	List<Genre> getAllGenre(String filter, String sidx, String sord);

	List<Album> getAllAlbums(String filter, String sidx, String sord);

	List<AlbumArtist> findAllAlbumArtist(String filter, String sidx, String sord);

	// Track
	Integer createTrack(Track track);

	void updateTrack(Track track);

	void deleteTrack(Track track);

	Track getTrackById(Integer id);

	List<Track> getTrackByAlbumId(Integer id);

	List<Track> getTrackBytitle(String title);

	List<Track> getAllTrack();

	List<Track> getAllTrack(String filter, String sidx, String sord);
}
