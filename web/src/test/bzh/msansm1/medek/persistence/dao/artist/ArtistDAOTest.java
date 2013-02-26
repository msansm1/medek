package bzh.msansm1.medek.persistence.dao.artist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import bzh.msansm1.medek.persistence.model.artist.Artist;

/**
 * Unit testing class for ArtistDAO. 2 context configurations available for
 * testing in Eclipse or in Jenkins. If running in eclipse, all the mapping
 * files (.hbm.xml) must be copied in src/test.
 * 
 * @author sguinard
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring-servlet.xml")
@TransactionConfiguration
@Transactional
public class ArtistDAOTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	final Logger logger = LoggerFactory.getLogger(ArtistDAOTest.class);

	protected static int SIZE = 1;

	protected static Integer ID_01 = new Integer(1);
	protected static String FIRST_NAME_01 = "John";
	protected static String NAME_01 = "Doe";
	protected static Integer TYPE_01 = new Integer(1);;// signification???
	protected static String NATIONALITY_01 = "Française";
	protected static String PICTURE_01 = "\\\\somewhere\\John_Doe.jpg";
	protected static String PICTURE_01b = "\\\\somewhere\\John_Doe_b.jpg";
	protected static String BIOLINK_01 = "http://...";

	protected static Integer ID_02 = new Integer(2);
	protected static String FIRST_NAME_02 = "Jane";
	protected static String NAME_02 = "Doe";
	protected static Integer TYPE_02 = new Integer(1);;// signification???
	protected static String NATIONALITY_02 = "Française";
	protected static String PICTURE_02 = "\\\\somewhere\\Jane_Doe.jpg";
	protected static String PICTURE_02b = "\\\\somewhere\\Jane_Doe_b.jpg";
	protected static String BIOLINK_02 = "http://...";

	protected int size;
	protected boolean delete = false;

	@Autowired
	protected ArtistDAO artistDao;

	/**
	 * Tests that the size and first record match what is expected before the
	 * transaction.
	 * 
	 * @throws SQLException
	 */
	@BeforeTransaction
	public void beforeTransaction() throws SQLException {
		initTable();
		testDeleteArtist();
	}

	private void initTable() {
		Artist artist = new Artist();
		artist.setBiolink(BIOLINK_01);
		artist.setFirstname(FIRST_NAME_01);
		artist.setName(NAME_01);
		artist.setNationality(NATIONALITY_01);
		artist.setPicture(PICTURE_01);
		artist.setType(TYPE_01);
		artistDao.create(artist);


		artist = new Artist();
		artist.setBiolink(BIOLINK_02);
		artist.setFirstname(FIRST_NAME_02);
		artist.setName(NAME_02);
		artist.setNationality(NATIONALITY_02);
		artist.setPicture(PICTURE_02);
		artist.setType(TYPE_02);
		artistDao.create(artist);

		size = artistDao.findAllArtist().size();
	}

	/**
	 * Tests Artist table and changes the first records picture.
	 */
	@Test
	public void testUpdateUser() throws SQLException {
		delete = false;
		assertNotNull("Artist DAO is null.", artistDao);

		List<Artist> lArtist = artistDao.findAllArtist();

		assertNotNull("Artist list is null.", lArtist);
		assertTrue("Number of artists should be equals or greater than " + SIZE
				+ ".", SIZE <= lArtist.size());

		for (Artist artist : lArtist) {
			assertNotNull("artist is null.", artist);

			if (ID_01.equals(artist.getId())) {
				assertEquals("artist first name should be " + FIRST_NAME_01
						+ ".", FIRST_NAME_01, artist.getFirstname());
				assertEquals("artist last name should be " + NAME_01 + ".",
						NAME_01, artist.getName());
				assertEquals("artist picture should be " + PICTURE_01 + ".",
						PICTURE_01, artist.getPicture());

				artist.setPicture(PICTURE_01b);

				artistDao.update(artist);
			}
		}
	}

	/**
	 * Tests delete second artist.
	 */
	@Test
	public void testDeleteArtist() throws SQLException {
		delete = true;
		assertNotNull("Artist DAO is null.", artistDao);

		List<Artist> lArtist = artistDao.findAllArtist();

		assertNotNull("User list is null.", lArtist);
		assertTrue("Number of users should be equals or greater than " + SIZE
				+ ".", SIZE <= lArtist.size());

		for (Artist artist : lArtist) {
			assertNotNull("User is null.", artist);
			if (artist.getId() == ID_02) {
				artistDao.delete(artist);
				break;
			}
		}
	}

	/**
	 * Tests getters of artist.
	 */
	@Test
	public void testGettersUser() throws SQLException {
		delete = false;
		assertNotNull("Artist DAO is null.", artistDao);

		List<Artist> lArtist = artistDao.findAllArtist();

		System.out.println(lArtist);

		assertNotNull("User list is null.", lArtist);
		assertTrue("Number of users should be equals or greater than " + SIZE
				+ ".", SIZE <= lArtist.size());

		assertNotNull("Getting artist by ID => user null.",
				artistDao.findArtistById(lArtist.get(0).getId()));
		assertNotNull("Getting artist by login => user null.",
				artistDao.findArtistByName(lArtist.get(0).getName()));
	}
}
