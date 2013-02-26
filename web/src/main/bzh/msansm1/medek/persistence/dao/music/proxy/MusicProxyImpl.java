package bzh.msansm1.medek.persistence.dao.music.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.music.AlbumArtistDAO;
import bzh.msansm1.medek.persistence.dao.music.AlbumDAO;
import bzh.msansm1.medek.persistence.dao.music.GenreDAO;
import bzh.msansm1.medek.persistence.dao.music.TrackArtistDAO;
import bzh.msansm1.medek.persistence.dao.music.TrackDAO;
import bzh.msansm1.medek.persistence.model.music.Album;
import bzh.msansm1.medek.persistence.model.music.AlbumArtist;
import bzh.msansm1.medek.persistence.model.music.Genre;
import bzh.msansm1.medek.persistence.model.music.Track;
import bzh.msansm1.medek.persistence.model.music.TrackArtist;

/**
 * DAO proxy class for table Music and relatives
 * 
 * @author sguinard
 * 
 */

public class MusicProxyImpl implements MusicProxy {

	@Autowired
	private AlbumArtistDAO albumArtistDao;

	@Autowired
	private AlbumDAO albumDao;

	@Autowired
	private GenreDAO genreDao;

	@Autowired
	private TrackArtistDAO trackArtistDao;

	@Autowired
	private TrackDAO trackDao;

	@Override
	public void createAlbumArtist(AlbumArtist albumArtist) {
		albumArtistDao.create(albumArtist);
	}

	@Override
	public void updateAlbumArtist(AlbumArtist albumArtist) {
		albumArtistDao.update(albumArtist);
	}

	@Override
	public void deleteAlbumArtist(AlbumArtist albumArtist) {
		albumArtistDao.delete(albumArtist);
	}

	@Override
	public AlbumArtist getAlbumArtistById(Integer id) {
		return albumArtistDao.findAlbumArtistById(id);
	}

	@Override
	public List<AlbumArtist> getAlbumArtistByArtistId(Integer id) {
		return albumArtistDao.findAlbumArtistByArtistId(id);
	}

	@Override
	public List<AlbumArtist> getAllAlbumArtist() {
		return albumArtistDao.findAllAlbumArtist();
	}

	@Override
	public Integer createAlbum(Album album) {
		return albumDao.create(album);
	}

	@Override
	public void updateAlbum(Album album) {
		albumDao.update(album);
	}

	@Override
	public void deleteAlbum(Album album) {
		albumDao.delete(album);
	}

	@Override
	public Album getAlbumById(Integer id) {
		return albumDao.findAlbumById(id);
	}

	@Override
	public List<Album> getAlbumByTitle(String title) {
		return albumDao.findAlbumByTitle(title);
	}

	@Override
	public List<Album> getAlbumByGenreId(Integer id) {
		return albumDao.findAlbumByGenreId(id);
	}

	@Override
	public List<Album> getAllAlbums() {
		return albumDao.findAllAlbums();
	}

	@Override
	public Integer createGenre(Genre genre) {
		return genreDao.create(genre);
	}

	@Override
	public void updateGenre(Genre genre) {
		genreDao.update(genre);
	}

	@Override
	public void deleteGenre(Genre genre) {
		genreDao.delete(genre);
	}

	@Override
	public Genre getGenreById(Integer id) {
		return genreDao.findGenreById(id);
	}

	@Override
	public List<Genre> getAllGenre() {
		return genreDao.findAllGenre();
	}

	@Override
	public void createTrackArtist(TrackArtist trackArtist) {
		trackArtistDao.create(trackArtist);
	}

	@Override
	public void updateTrackArtist(TrackArtist trackArtist) {
		trackArtistDao.update(trackArtist);
	}

	@Override
	public void deleteTrackArtist(TrackArtist trackArtist) {
		trackArtistDao.delete(trackArtist);
	}

	@Override
	public TrackArtist getTrackArtistById(Integer id) {
		return trackArtistDao.findTrackArtistById(id);
	}

	@Override
	public List<TrackArtist> getTrackArtistByArtistId(Integer id) {
		return trackArtistDao.findTrackArtistByArtistId(id);
	}

	@Override
	public List<TrackArtist> getAllTrackArtist() {
		return trackArtistDao.findAllTrackArtist();
	}

	@Override
	public List<TrackArtist> getAllTrackArtist(String filter, String sidx,
			String sord) {
		return trackArtistDao.findAllTrackArtist(filter, sidx, sord);
	}

	@Override
	public List<Genre> getAllGenre(String filter, String sidx, String sord) {
		return genreDao.findAllGenre(filter, sidx, sord);
	}

	@Override
	public List<Album> getAllAlbums(String filter, String sidx, String sord) {
		return albumDao.findAllAlbums(filter, sidx, sord);
	}

	@Override
	public List<AlbumArtist> findAllAlbumArtist(String filter, String sidx,
			String sord) {
		return albumArtistDao.findAllAlbumArtist(filter, sidx, sord);
	}

	@Override
	public Integer createTrack(Track track) {
		return trackDao.create(track);
	}

	@Override
	public void updateTrack(Track track) {
		trackDao.update(track);
	}

	@Override
	public void deleteTrack(Track track) {
		trackDao.delete(track);
	}

	@Override
	public Track getTrackById(Integer id) {
		return trackDao.findTrackById(id);
	}

	@Override
	public List<Track> getTrackByAlbumId(Integer id) {
		return trackDao.findTrackByAlbumId(id);
	}

	@Override
	public List<Track> getTrackBytitle(String title) {
		return trackDao.findTrackBytitle(title);
	}

	@Override
	public List<Track> getAllTrack() {
		return trackDao.findAllTrack();
	}

	@Override
	public List<Track> getAllTrack(String filter, String sidx, String sord) {
		return trackDao.findAllTrack(filter, sidx, sord);
	}

}
