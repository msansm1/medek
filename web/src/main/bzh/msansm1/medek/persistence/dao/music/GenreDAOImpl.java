package bzh.msansm1.medek.persistence.dao.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.music.Genre;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class GenreDAOImpl implements GenreDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Genre genre) {
		template.persist(genre);
		template.refresh(genre);
		return genre.getId();
	}

	@Override
	public void update(Genre genre) {
		template.merge(genre);
	}

	@Override
	public void delete(Genre genre) {
		template.delete(genre);
	}

	@Override
	public Genre findGenreById(Integer id) {
		return template.load(Genre.class, id);
	}

	@Override
	public List<Genre> findAllGenre() {
		return template.loadAll(Genre.class);
	}

	@Override
	public List<Genre> findAllGenre(String filter, String sidx, String sord) {
		return template.find("SELECT g FROM GENRE g " + filter
				+ " ORDER BY g."
				+ sidx + " " + sord);
	}

}
