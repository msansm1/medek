package com.devoteam.springhibernate.persistence.dao;

import java.util.List;

import com.devoteam.springhibernate.persistence.model.User;

/**
 * User table DAO class interface.
 * 
 * @author rbarbot
 *
 */
public interface UserDAO {
	
	void create(User user);
	
	void update(User user);
	
	void delete(User user);
	
	User findById(Integer id);
	
	List<Object[]> findByLogin(String login);
	
	List<User> findAll();

	List<Object[]> findAll(String filter, String sidx, String sord);

}
