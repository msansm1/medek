package bzh.msansm1.medek.persistence.dao.tvshow;

import java.util.List;

import bzh.msansm1.medek.persistence.model.tvshow.TvshowSubtitle;

/**
 * TvshowSubtitle table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface TvshowSubtitleDAO {

	void create(TvshowSubtitle tvshowSubtitle);

	void update(TvshowSubtitle tvshowSubtitle);

	void delete(TvshowSubtitle tvshowSubtitle);

	TvshowSubtitle findTvshowSubtitleById(Integer id);

	List<TvshowSubtitle> findAllTvshowSubtitle();

}
