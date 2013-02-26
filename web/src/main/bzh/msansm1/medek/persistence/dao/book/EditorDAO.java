package bzh.msansm1.medek.persistence.dao.book;

import java.util.List;

import bzh.msansm1.medek.persistence.model.book.Editor;

/**
 * Editor table DAO class interface.
 * 
 * @author sguinard
 * 
 */

public interface EditorDAO {

	Integer create(Editor editor);

	void update(Editor editor);

	void delete(Editor editor);

	Editor findEditorById(Integer id);

	List<Editor> findAllEditor();

}
