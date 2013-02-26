package bzh.msansm1.medek.persistence.dao.tvshow;

import java.util.List;

import bzh.msansm1.medek.persistence.model.tvshow.TvshowArtist;

/**
 * TvshowArtist table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface TvshowArtistDAO {

	void create(TvshowArtist tvshowArtist);

	void update(TvshowArtist tvshowArtist);

	void delete(TvshowArtist tvshowArtist);

	TvshowArtist findTvshowArtistById(Integer id);

	List<TvshowArtist> findAllTvshowArtist();

}
