package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import bzh.msansm1.medek.persistence.model.book.Editor;

/**
 * 
 * @author sguinard
 * 
 */

@Component
public class EditorDAOImpl implements EditorDAO {

	@Autowired
	private HibernateTemplate template;

	@Override
	public Integer create(Editor editor) {
		template.persist(editor);
		template.refresh(editor);
		return editor.getId();
	}

	@Override
	public void update(Editor editor) {
		template.merge(editor);
	}

	@Override
	public void delete(Editor editor) {
		template.delete(editor);
	}

	@Override
	public Editor findEditorById(Integer id) {
		return template.load(Editor.class, id);
	}

	@Override
	public List<Editor> findAllEditor() {
		return template.loadAll(Editor.class);
	}

}
