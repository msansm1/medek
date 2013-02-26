package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import bzh.msansm1.medek.persistence.model.common.StoryGenre;

/**
 * StoryGenre table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface StoryGenreDAO {

	Integer create(StoryGenre storyGenre);

	void update(StoryGenre storyGenre);

	void delete(StoryGenre storyGenre);

	StoryGenre findStoryGenreById(Integer id);

	List<StoryGenre> findAllStoryGenre();

}
