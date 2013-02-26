package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.book.Book;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class BookDAOImpl implements BookDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Book book) {
		template.persist(book);
		template.refresh(book);
		return book.getId();
	}

	@Override
	public void update(Book book) {
		template.merge(book);
	}

	@Override
	public void delete(Book book) {
		template.delete(book);
	}

	@Override
	public Book findBookById(Integer id) {
		return template.load(Book.class, id);
	}

	@Override
	public List<Book> findAllBook() {
		return template.loadAll(Book.class);
	}

}
