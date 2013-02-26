package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.book.BookArtist;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class BookArtistDAOImpl implements BookArtistDAO {

	@Autowired
	private HibernateTemplate template;


	@Override
	public void create(BookArtist bookArtist) {
		template.persist(bookArtist);
		template.refresh(bookArtist);
	}

	@Override
	public void update(BookArtist bookArtist) {
		template.merge(bookArtist);
	}

	@Override
	public void delete(BookArtist bookArtist) {
		template.delete(bookArtist);
	}

	@Override
	public List<BookArtist> findBookArtistByBookId(Integer id) {
		return template.find("SELECT ba FROM BOOKARTIST ba WHERE ba.BOOK='"
				+ id + "'");
	}

	@Override
	public List<BookArtist> findBookArtistByArtistId(Integer id) {
		return template.find("SELECT ba FROM BOOKARTIST ba WHERE ba.ARTIST='"
				+ id + "'");
	}

	@Override
	public List<BookArtist> findAllBookArtist() {
		return template.loadAll(BookArtist.class);
	}

}
