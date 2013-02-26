package bzh.msansm1.medek.persistence.dao.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.movie.MovieArtist;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class MovieArtistDAOImpl implements MovieArtistDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(MovieArtist movieArtist) {
		template.persist(movieArtist);
		template.refresh(movieArtist);
	}

	@Override
	public void update(MovieArtist movieArtist) {
		template.merge(movieArtist);
	}

	@Override
	public void delete(MovieArtist movieArtist) {
		template.delete(movieArtist);
	}

	@Override
	public List<MovieArtist> findMovieArtistByMovieId(Integer id) {
		return template.find("SELECT ma FROM MOVIEARTIST ma WHERE ma.MOVIE='"
				+ id + "'");
	}

	@Override
	public List<MovieArtist> findMovieArtistByArtistId(Integer id) {
		return template.find("SELECT ma FROM MOVIEARTIST ma WHERE ma.ARTIST='"
				+ id + "'");
	}

	@Override
	public List<MovieArtist> findAllMovieArtist() {
		return template.loadAll(MovieArtist.class);
	}

}
