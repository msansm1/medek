package bzh.msansm1.medek.persistence.dao.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.common.StoryGenre;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class StoryGenreDAOImpl implements StoryGenreDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(StoryGenre storyGenre) {
		template.persist(storyGenre);
		template.refresh(storyGenre);
		return storyGenre.getId();
	}

	@Override
	public void update(StoryGenre storyGenre) {
		template.merge(storyGenre);
	}

	@Override
	public void delete(StoryGenre storyGenre) {
		template.delete(storyGenre);
	}

	@Override
	public StoryGenre findStoryGenreById(Integer id) {
		return template.load(StoryGenre.class, id);
	}

	@Override
	public List<StoryGenre> findAllStoryGenre() {
		return template.loadAll(StoryGenre.class);
	}

}
