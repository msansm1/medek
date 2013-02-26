package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.BookArtist;

/**
 * BookArtist table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface BookArtistDAO {
	
	void create(BookArtist bookArtist);
	
	void update(BookArtist bookArtist);
	
	void delete(BookArtist bookArtist);
	
	List<BookArtist> findBookArtistByBookId(Integer id);
	
	List<BookArtist> findBookArtistByArtistId(Integer id);
	
	List<BookArtist> findAllBookArtist();

}
