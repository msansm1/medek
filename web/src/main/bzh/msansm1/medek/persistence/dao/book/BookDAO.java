package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.Book;

/**
 * Book table DAO class interface.
 * 
 * @author sguinard
 *
 */

public interface BookDAO {
	
	Integer create(Book book);
	
	void update(Book book);
	
	void delete(Book book);
	
	Book findBookById(Integer id);
	
	List<Book> findAllBook();

}
