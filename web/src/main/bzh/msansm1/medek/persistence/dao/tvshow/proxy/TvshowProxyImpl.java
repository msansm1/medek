package bzh.msansm1.medek.persistence.dao.tvshow.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.tvshow.TvshowArtistDAO;
import bzh.msansm1.medek.persistence.dao.tvshow.TvshowDAO;
import bzh.msansm1.medek.persistence.dao.tvshow.TvshowLangDAO;
import bzh.msansm1.medek.persistence.dao.tvshow.TvshowSubtitleDAO;
import bzh.msansm1.medek.persistence.model.tvshow.Tvshow;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowArtist;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowLang;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowSubtitle;

/**
 * DAO proxy class for table Tvshow and relatives
 * 
 * @author sguinard
 * 
 */

public class TvshowProxyImpl implements TvshowProxy {

	@Autowired
	private TvshowArtistDAO tvshowArtistDao;

	@Autowired
	private TvshowDAO tvshowDao;

	@Autowired
	private TvshowLangDAO tvshowLangDao;

	@Autowired
	private TvshowSubtitleDAO tvshowSubtitleDao;

	@Override
	public void createTvshowArtist(TvshowArtist tvshowArtist) {
		tvshowArtistDao.create(tvshowArtist);
	}

	@Override
	public void updateTvshowArtist(TvshowArtist tvshowArtist) {
		tvshowArtistDao.update(tvshowArtist);
	}

	@Override
	public void deleteTvshowArtist(TvshowArtist tvshowArtist) {
		tvshowArtistDao.delete(tvshowArtist);
	}

	@Override
	public TvshowArtist getTvshowArtistById(Integer id) {
		return tvshowArtistDao.findTvshowArtistById(id);
	}

	@Override
	public List<TvshowArtist> getAllTvshowArtist() {
		return tvshowArtistDao.findAllTvshowArtist();
	}

	@Override
	public Integer createTvshow(Tvshow tvshow) {
		return tvshowDao.create(tvshow);
	}

	@Override
	public void updateTvshow(Tvshow tvshow) {
		tvshowDao.update(tvshow);
	}

	@Override
	public void deleteTvshow(Tvshow tvshow) {
		tvshowDao.delete(tvshow);
	}

	@Override
	public Tvshow getTvshowById(Integer id) {
		return tvshowDao.findTvshowById(id);
	}

	@Override
	public List<Tvshow> getAllTvshow() {
		return tvshowDao.findAllTvshow();
	}

	@Override
	public void createTvshowLang(TvshowLang tvshowLang) {
		tvshowLangDao.create(tvshowLang);
	}

	@Override
	public void updateTvshowLang(TvshowLang tvshowLang) {
		tvshowLangDao.update(tvshowLang);
	}

	@Override
	public void deleteTvshowLang(TvshowLang tvshowLang) {
		tvshowLangDao.delete(tvshowLang);
	}

	@Override
	public TvshowLang getTvshowLangById(Integer id) {
		return tvshowLangDao.findTvshowLangById(id);
	}

	@Override
	public List<TvshowLang> getAllTvshowLang() {
		return tvshowLangDao.findAllTvshowLang();
	}

	@Override
	public void createTvshowSubtitle(TvshowSubtitle tvshowSubtitle) {
		tvshowSubtitleDao.create(tvshowSubtitle);
	}

	@Override
	public void updateTvshowSubtitle(TvshowSubtitle tvshowSubtitle) {
		tvshowSubtitleDao.update(tvshowSubtitle);
	}

	@Override
	public void deleteTvshowSubtitle(TvshowSubtitle tvshowSubtitle) {
		tvshowSubtitleDao.delete(tvshowSubtitle);
	}

	@Override
	public TvshowSubtitle getTvshowSubtitleById(Integer id) {
		return tvshowSubtitleDao.findTvshowSubtitleById(id);
	}

	@Override
	public List<TvshowSubtitle> getAllTvshowSubtitle() {
		return tvshowSubtitleDao.findAllTvshowSubtitle();
	}

}
