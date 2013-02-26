package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.BookType;

/**
 * BookType table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface BookTypeDAO {
	
	void create(BookType bookType);

	void update(BookType bookType);
	
	void delete(BookType bookType);
	
	BookType findBookTypeById(Integer id);
	
	List<BookType> findAllBookType();

}
