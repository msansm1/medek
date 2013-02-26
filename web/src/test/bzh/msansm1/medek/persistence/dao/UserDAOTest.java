package bzh.msansm1.medek.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import bzh.msansm1.medek.persistence.dao.user.UserDAO;
import bzh.msansm1.medek.persistence.model.users.User;

/**
 * Unit testing class for UserDAO.
 * 2 context configurations available for testing in Eclipse or in Jenkins.
 * If running in eclipse, all the mapping files (.hbm.xml) must be
 * copied in src/test.
 * 
 * @author rbarbot
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Spring-servlet.xml")
@TransactionConfiguration
@Transactional
public class UserDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    final Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
    
	protected static int SIZE = 1;
	protected static Integer ID_01;
	protected static String LOGIN_01 = "test01";
	protected static String FIRST_NAME_01 = "Albert";
	protected static String LAST_NAME_01 = "Dupond";
	protected static String LAST_NAME_01b = "Durand";
	protected static String PASSWORD_01 = "test01";
	protected static String EMAIL_01 = "adupond@test.fr";

	protected static Integer ID_02;
	protected static String LOGIN_02 = "test02";
	protected static String FIRST_NAME_02 = "John";
	protected static String LAST_NAME_02 = "Doe";
	protected static String LAST_NAME_02b = "Doell";
	protected static String PASSWORD_02 = "test02";
	protected static String EMAIL_02 = "john@test.fr";

    protected int size;
    protected boolean delete = false;

    @Autowired
    protected UserDAO userDao;
    
    /**
	 * Tests that the size and first record match what is expected before the
	 * transaction.
	 * 
	 * @throws SQLException
	 */
    @BeforeTransaction
	public void beforeTransaction() throws SQLException {
		initTable();
    }

    private void initTable() {
		Boolean user1Exist = false;
		Boolean user2Exist = false;
		List<User> lUser = userDao.findAllUser();
		if (!lUser.isEmpty()) {
			for (User user : lUser) {

				if (LOGIN_01.equals(user.getLogin())) {
					user1Exist = true;
					ID_01 = user.getId();
				} else if (LOGIN_02.equals(user.getLogin())) {
					user2Exist = true;
					ID_02 = user.getId();
				}
				if (user1Exist && user2Exist)
					break;
			}
		}

    	User user = new User();
		if (!user1Exist) {
			user.setLogin(LOGIN_01);
			user.setFirstname(FIRST_NAME_01);
			user.setLastname(LAST_NAME_01);
			user.setPassword(PASSWORD_01);
			user.setEmail(EMAIL_01);
			ID_01 = userDao.create(user);
		}

		if (!user2Exist) {
			user = new User();
			user.setLogin(LOGIN_02);
			user.setFirstname(FIRST_NAME_02);
			user.setLastname(LAST_NAME_02);
			user.setPassword(PASSWORD_02);
			user.setEmail(EMAIL_02);
			ID_02 = userDao.create(user);
		}

		size = userDao.findAllUser().size();
	}

	/**
     * Tests user table and changes the first records last name.
     */
    @Test
    public void testUpdateUser() throws SQLException {
    	delete = false;
        assertNotNull("User DAO is null.", userDao);
        
		List<User> lUser = userDao.findAllUser();
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
        for (User user : lUser) {
            assertNotNull("User is null.", user);
                        
			if (ID_01.equals(user.getId())) {
				assertEquals(
						"User first name should be " + FIRST_NAME_01 + ".",
						FIRST_NAME_01, user.getFirstname());
				assertEquals("User last name should be " + LAST_NAME_01 + ".",
						LAST_NAME_01, user.getLastname());
                
				user.setLastname(LAST_NAME_01b);
                
                userDao.update(user);
            }
        }
    }

	/**
     * Tests delete second user.
     */
    @Test
    public void testDeleteUser() throws SQLException {
    	delete = true;
        assertNotNull("User DAO is null.", userDao);
        
		List<User> lUser = userDao.findAllUser();
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
        for (User user : lUser) {
            assertNotNull("User is null.", user);
			if (user.getId() == ID_02) {
            	userDao.delete(user);
            	break;
            }
        }
    }

	/**
     * Tests getters of user.
     */
    @Test
    public void testGettersUser() throws SQLException {
    	delete = false;
        assertNotNull("User DAO is null.", userDao);
        
		List<User> lUser = userDao.findAllUser();

		System.out.println(lUser);
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
		assertNotNull("Getting user by ID => user null.",
				userDao.findUserById(lUser.get(0).getId()));
		assertNotNull("Getting user by login => user null.",
				userDao.findUserByLogin(lUser.get(0).getLogin()));
    }

    /**
     * Tests that the size and first record match what is expected 
     * after the transaction.
     */
    @AfterTransaction
    public void afterTransaction() {
		testuser(false, LAST_NAME_01);
    }

    /**
     * Tests user table.
     */
    protected void testuser(boolean beforeTransaction, String matchLastName) {
        List<Map<String, Object>> lUsersMaps = simpleJdbcTemplate.queryForList("SELECT * FROM user");

        assertNotNull("User list is null.", lUsersMaps);

        if (!delete) {
        	assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUsersMaps.size());
        }
        else {
        	assertEquals("Number of users should be equals to " + size + "-1.", size-1 , lUsersMaps.size());
        }

		Map<String, Object> huser = lUsersMaps.get(1);

        logger.debug((beforeTransaction ? "Before" : "After") + " transaction.  " + huser.toString());
            
        Integer id = (Integer)huser.get("id");
        String firstName = (String)huser.get("firstName");
        String lastName = (String)huser.get("lastName");
        
		if (ID_01.equals(id)) {
			assertEquals("User first name should be " + FIRST_NAME_01 + ".",
					FIRST_NAME_01, firstName);
            assertEquals("User last name should be " + matchLastName + ".", matchLastName, lastName);
        }
    }
    
}
