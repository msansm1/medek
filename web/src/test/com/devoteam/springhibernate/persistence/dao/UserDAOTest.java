package com.devoteam.springhibernate.persistence.dao;

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

import com.devoteam.springhibernate.persistence.model.User;

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
    
    protected static int SIZE = 2;
    protected static Integer ID = new Integer(1);
    protected static String FIRST_NAME = "Albert";
    protected static String LAST_NAME = "Dupond";
    protected static String CHANGED_LAST_NAME = "Durand";
    protected int size;
    protected boolean delete = false;

    @Autowired
    protected UserDAO userDao;
    
    /**
     * Tests that the size and first record match what is expected 
     * before the transaction.
     */
    @BeforeTransaction
    public void beforeTransaction() {
    	initTable();
        testuser(true, LAST_NAME);
    }

    private void initTable() {
    	simpleJdbcTemplate.update("CREATE TABLE IF NOT EXISTS `user` ("+
									  "`id` INT UNSIGNED NOT NULL AUTO_INCREMENT ,"+
									  "`login` VARCHAR(20) NOT NULL ,"+
									  "`password` CHAR(32) NOT NULL ,"+
									  "`lastName` VARCHAR(50) NOT NULL ,"+
									  "`firstName` VARCHAR(50) NOT NULL ,"+
									  "`email` VARCHAR(100) NOT NULL ,"+
									  "PRIMARY KEY (`Id`) );");
    	User user = new User();
    	user.setLogin("test01");
    	user.setFirstName(FIRST_NAME);
    	user.setLastName(LAST_NAME);
    	user.setPassword("test01");
    	user.setEmail("adupond@test.fr");
    	userDao.create(user);
    	
    	user = new User();
    	user.setLogin("test02");
    	user.setFirstName("John");
    	user.setLastName("Doe");
    	user.setPassword("test02");
    	user.setEmail("john@test.fr");
    	userDao.create(user);
    	
    	size = userDao.findAll().size();
	}

	/**
     * Tests user table and changes the first records last name.
     */
    @Test
    public void testUpdateUser() throws SQLException {
    	delete = false;
        assertNotNull("User DAO is null.", userDao);
        
        List<User> lUser = userDao.findAll();
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
        for (User user : lUser) {
            assertNotNull("User is null.", user);
                        
            if (ID.equals(user.getId())) {                
                assertEquals("User first name should be " + FIRST_NAME + ".", FIRST_NAME, user.getFirstName());
                assertEquals("User last name should be " + LAST_NAME + ".", LAST_NAME, user.getLastName());
                
                user.setLastName(CHANGED_LAST_NAME);
                
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
        
        List<User> lUser = userDao.findAll();
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
        boolean first = true;
        for (User user : lUser) {
            assertNotNull("User is null.", user);
            if (!first) {
            	userDao.delete(user);
            	break;
            }
            first = false;
        }
    }

	/**
     * Tests getters of user.
     */
    @Test
    public void testGettersUser() throws SQLException {
    	delete = false;
        assertNotNull("User DAO is null.", userDao);
        
        List<User> lUser = userDao.findAll();
        
        assertNotNull("User list is null.", lUser);
        assertTrue("Number of users should be equals or greater than " + SIZE + ".", SIZE <= lUser.size());
        
        assertNotNull("Getting user by ID => user null.", userDao.findById(lUser.get(0).getId()));
        assertNotNull("Getting user by login => user null.", userDao.findByLogin(lUser.get(0).getLogin()));
    }

    /**
     * Tests that the size and first record match what is expected 
     * after the transaction.
     */
    @AfterTransaction
    public void afterTransaction() {
        testuser(false, LAST_NAME);
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

        Map<String, Object> huser = lUsersMaps.get(0);

        logger.debug((beforeTransaction ? "Before" : "After") + " transaction.  " + huser.toString());
            
        Integer id = (Integer)huser.get("id");
        String firstName = (String)huser.get("firstName");
        String lastName = (String)huser.get("lastName");
        
        if (ID.equals(id)) {                
            assertEquals("User first name should be " + FIRST_NAME + ".", FIRST_NAME, firstName);
            assertEquals("User last name should be " + matchLastName + ".", matchLastName, lastName);
        }
    }
    
}
