package bzh.msansm1.medek.persistence.dao.book.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.book.BookArtistDAO;
import bzh.msansm1.medek.persistence.dao.book.BookDAO;
import bzh.msansm1.medek.persistence.dao.book.BookTypeDAO;
import bzh.msansm1.medek.persistence.dao.book.CollectionDAO;
import bzh.msansm1.medek.persistence.dao.book.EditorDAO;
import bzh.msansm1.medek.persistence.model.book.Book;
import bzh.msansm1.medek.persistence.model.book.BookArtist;
import bzh.msansm1.medek.persistence.model.book.BookType;
import bzh.msansm1.medek.persistence.model.book.Collection;
import bzh.msansm1.medek.persistence.model.book.Editor;

/**
 * DAO proxy class for table Book and relatives
 * 
 * @author sguinard
 * 
 */

public class BookProxyImpl implements BookProxy {

	@Autowired
	private BookArtistDAO bookArtistDao;

	@Autowired
	private BookDAO bookDao;

	@Autowired
	private BookTypeDAO bookTypeDao;

	@Autowired
	private CollectionDAO collectionDao;

	@Autowired
	private EditorDAO editorDao;

	@Override
	public void createBookArtist(BookArtist bookArtist) {
		bookArtistDao.create(bookArtist);
	}

	@Override
	public void updateBookArtist(BookArtist bookArtist) {
		bookArtistDao.update(bookArtist);
	}

	@Override
	public void deleteBookArtist(BookArtist bookArtist) {
		bookArtistDao.delete(bookArtist);
	}

	@Override
	public List<BookArtist> getBookArtistByBookId(Integer id) {
		return bookArtistDao.findBookArtistByBookId(id);
	}

	@Override
	public List<BookArtist> getBookArtistByArtistId(Integer id) {
		return bookArtistDao.findBookArtistByArtistId(id);
	}

	@Override
	public List<BookArtist> getAllBookArtist() {
		return bookArtistDao.findAllBookArtist();
	}

	@Override
	public Integer createBook(Book book) {
		return bookDao.create(book);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.update(book);
	}

	@Override
	public void deleteBook(Book book) {
		bookDao.delete(book);
	}

	@Override
	public Book getBookById(Integer id) {
		return bookDao.findBookById(id);
	}

	@Override
	public List<Book> getAllBook() {
		return bookDao.findAllBook();
	}

	@Override
	public void createBookType(BookType bookType) {
		bookTypeDao.create(bookType);
	}

	@Override
	public void updateBookType(BookType bookType) {
		bookTypeDao.update(bookType);
	}

	@Override
	public void deleteBookType(BookType bookType) {
		bookTypeDao.delete(bookType);
	}

	@Override
	public BookType getBookTypeById(Integer id) {
		return bookTypeDao.findBookTypeById(id);
	}

	@Override
	public List<BookType> getAllBookType() {
		return bookTypeDao.findAllBookType();
	}

	@Override
	public Integer createCollection(Collection collection) {
		return collectionDao.create(collection);
	}

	@Override
	public void updateCollection(Collection collection) {
		collectionDao.update(collection);
	}

	@Override
	public void deleteCollection(Collection collection) {
		collectionDao.delete(collection);
	}

	@Override
	public Collection getCollectionById(Integer id) {
		return collectionDao.findCollectionById(id);
	}

	@Override
	public List<Collection> getAllCollection() {
		return collectionDao.findAllCollection();
	}

	@Override
	public Integer createEditor(Editor editor) {
		return editorDao.create(editor);
	}

	@Override
	public void updateEditor(Editor editor) {
		editorDao.update(editor);
	}

	@Override
	public void deleteEditor(Editor editor) {
		editorDao.delete(editor);
	}

	@Override
	public Editor getEditorById(Integer id) {
		return editorDao.findEditorById(id);
	}

	@Override
	public List<Editor> findAllEditor() {
		return editorDao.findAllEditor();
	}

}
