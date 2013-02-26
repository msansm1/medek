package bzh.msansm1.medek.persistence.dao.tvshow;

import java.util.List;

import bzh.msansm1.medek.persistence.model.tvshow.TvshowLang;

/**
 * TvshowLang table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface TvshowLangDAO {

	void create(TvshowLang tvshowLang);

	void update(TvshowLang tvshowLang);

	void delete(TvshowLang tvshowLang);

	TvshowLang findTvshowLangById(Integer id);

	List<TvshowLang> findAllTvshowLang();

}
