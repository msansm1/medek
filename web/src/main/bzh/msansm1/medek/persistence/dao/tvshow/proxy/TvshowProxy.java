package bzh.msansm1.medek.persistence.dao.tvshow.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.tvshow.Tvshow;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowArtist;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowLang;
import bzh.msansm1.medek.persistence.model.tvshow.TvshowSubtitle;

/**
 * DAO proxy class interface for table Tvshow and relatives
 * 
 * @author sguinard
 * 
 */

public interface TvshowProxy {

	// TvshowArtist
	void createTvshowArtist(TvshowArtist tvshowArtist);

	void updateTvshowArtist(TvshowArtist tvshowArtist);

	void deleteTvshowArtist(TvshowArtist tvshowArtist);

	TvshowArtist getTvshowArtistById(Integer id);

	List<TvshowArtist> getAllTvshowArtist();

	// Tvshow
	Integer createTvshow(Tvshow tvshow);

	void updateTvshow(Tvshow tvshow);

	void deleteTvshow(Tvshow tvshow);

	Tvshow getTvshowById(Integer id);

	List<Tvshow> getAllTvshow();

	// TvshowLang
	void createTvshowLang(TvshowLang tvshowLang);

	void updateTvshowLang(TvshowLang tvshowLang);

	void deleteTvshowLang(TvshowLang tvshowLang);

	TvshowLang getTvshowLangById(Integer id);

	List<TvshowLang> getAllTvshowLang();

	// TvshowSubtitle
	void createTvshowSubtitle(TvshowSubtitle tvshowSubtitle);

	void updateTvshowSubtitle(TvshowSubtitle tvshowSubtitle);

	void deleteTvshowSubtitle(TvshowSubtitle tvshowSubtitle);

	TvshowSubtitle getTvshowSubtitleById(Integer id);

	List<TvshowSubtitle> getAllTvshowSubtitle();

}
