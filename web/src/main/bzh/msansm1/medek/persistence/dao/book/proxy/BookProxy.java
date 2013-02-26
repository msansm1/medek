package bzh.msansm1.medek.persistence.dao.book.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.Book;
import bzh.msansm1.medek.persistence.model.book.BookArtist;
import bzh.msansm1.medek.persistence.model.book.BookType;
import bzh.msansm1.medek.persistence.model.book.Collection;
import bzh.msansm1.medek.persistence.model.book.Editor;

/**
 * DAO proxy class interface for table Book and relatives
 * 
 * @author sguinard
 * 
 */

public interface BookProxy {

	// BookArtist
	void createBookArtist(BookArtist bookArtist);

	void updateBookArtist(BookArtist bookArtist);

	void deleteBookArtist(BookArtist bookArtist);

	List<BookArtist> getBookArtistByBookId(Integer id);

	List<BookArtist> getBookArtistByArtistId(Integer id);

	List<BookArtist> getAllBookArtist();

	// Book
	Integer createBook(Book book);

	void updateBook(Book book);

	void deleteBook(Book book);

	Book getBookById(Integer id);

	List<Book> getAllBook();

	// BookType
	void createBookType(BookType bookType);

	void updateBookType(BookType bookType);

	void deleteBookType(BookType bookType);

	BookType getBookTypeById(Integer id);

	List<BookType> getAllBookType();

	// Collection
	Integer createCollection(Collection collection);

	void updateCollection(Collection collection);

	void deleteCollection(Collection collection);

	Collection getCollectionById(Integer id);

	List<Collection> getAllCollection();

	// Editor
	Integer createEditor(Editor editor);

	void updateEditor(Editor editor);

	void deleteEditor(Editor editor);

	Editor getEditorById(Integer id);

	List<Editor> findAllEditor();

}
