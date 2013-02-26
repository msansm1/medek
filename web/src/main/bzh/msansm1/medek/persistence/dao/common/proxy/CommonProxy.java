package bzh.msansm1.medek.persistence.dao.common.proxy;

import java.util.List;

import bzh.msansm1.medek.persistence.model.common.Lang;
import bzh.msansm1.medek.persistence.model.common.StoryGenre;
import bzh.msansm1.medek.persistence.model.common.Support;

/**
 * DAO proxy class interface for common tables
 * 
 * @author sguinard
 * 
 */

public interface CommonProxy {

	// Database
	String getDatabaseVersion();

	// Lang
	Integer createLang(Lang lang);

	void updateLang(Lang lang);

	void deleteLang(Lang lang);

	Lang getLangById(Integer id);

	List<Lang> getAllLang();

	// StoryGenre
	Integer createStoryGenre(StoryGenre storyGenre);

	void updateStoryGenre(StoryGenre storyGenre);

	void deleteStoryGenre(StoryGenre storyGenre);

	StoryGenre getStoryGenreById(Integer id);

	List<StoryGenre> getAllStoryGenre();

	// Support
	Integer createSupport(Support support);

	void updateSupport(Support support);

	void deleteSupport(Support support);

	Support getSupportById(Integer id);

	List<Support> getAllSupport();

}
