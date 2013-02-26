package bzh.msansm1.medek.persistence.dao.common.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bzh.msansm1.medek.persistence.dao.common.DatabaseDAO;
import bzh.msansm1.medek.persistence.dao.common.LangDAO;
import bzh.msansm1.medek.persistence.dao.common.StoryGenreDAO;
import bzh.msansm1.medek.persistence.dao.common.SupportDAO;
import bzh.msansm1.medek.persistence.model.common.Lang;
import bzh.msansm1.medek.persistence.model.common.StoryGenre;
import bzh.msansm1.medek.persistence.model.common.Support;

/**
 * DAO proxy class for common tables
 * 
 * @author sguinard
 * 
 */

public class CommonProxyImpl implements CommonProxy {

	@Autowired
	private DatabaseDAO databaseDao;

	@Autowired
	private LangDAO langDao;

	@Autowired
	private StoryGenreDAO storyGenreDao;

	@Autowired
	private SupportDAO supportDao;

	@Override
	public String getDatabaseVersion() {
		return databaseDao.findAllDatabase().get(0).getVersion();
	}

	@Override
	public Integer createLang(Lang lang) {
		return langDao.create(lang);
	}

	@Override
	public void updateLang(Lang lang) {
		langDao.update(lang);
	}

	@Override
	public void deleteLang(Lang lang) {
		langDao.delete(lang);
	}

	@Override
	public Lang getLangById(Integer id) {
		return langDao.findLangById(id);
	}

	@Override
	public List<Lang> getAllLang() {
		return langDao.findAllLang();
	}

	@Override
	public Integer createStoryGenre(StoryGenre storyGenre) {
		return storyGenreDao.create(storyGenre);
	}

	@Override
	public void updateStoryGenre(StoryGenre storyGenre) {
		storyGenreDao.update(storyGenre);
	}

	@Override
	public void deleteStoryGenre(StoryGenre storyGenre) {
		storyGenreDao.delete(storyGenre);
	}

	@Override
	public StoryGenre getStoryGenreById(Integer id) {
		return storyGenreDao.findStoryGenreById(id);
	}

	@Override
	public List<StoryGenre> getAllStoryGenre() {
		return storyGenreDao.findAllStoryGenre();
	}

	@Override
	public Integer createSupport(Support support) {
		return supportDao.create(support);
	}

	@Override
	public void updateSupport(Support support) {
		supportDao.update(support);
	}

	@Override
	public void deleteSupport(Support support) {
		supportDao.delete(support);
	}

	@Override
	public Support getSupportById(Integer id) {
		return supportDao.findSupportById(id);
	}

	@Override
	public List<Support> getAllSupport() {
		return supportDao.findAllSupport();
	}

}
