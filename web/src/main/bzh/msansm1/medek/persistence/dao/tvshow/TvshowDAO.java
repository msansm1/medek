package bzh.msansm1.medek.persistence.dao.tvshow;

import java.util.List;

import bzh.msansm1.medek.persistence.model.tvshow.Tvshow;

/**
 * Tvshow table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface TvshowDAO {

	Integer create(Tvshow tvshow);

	void update(Tvshow tvshow);

	void delete(Tvshow tvshow);

	Tvshow findTvshowById(Integer id);

	List<Tvshow> findAllTvshow();

}
