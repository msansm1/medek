package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.book.BookType;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class BookTypeDAOImpl implements BookTypeDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public void create(BookType bookType) {
		template.persist(bookType);
		template.refresh(bookType);
	}

	@Override
	public void update(BookType bookType) {
		template.merge(bookType);
	}

	@Override
	public void delete(BookType bookType) {
		template.delete(bookType);
	}

	@Override
	public BookType findBookTypeById(Integer id) {
		return template.load(BookType.class, id);
	}

	@Override
	public List<BookType> findAllBookType() {
		return template.loadAll(BookType.class);
	}

}
