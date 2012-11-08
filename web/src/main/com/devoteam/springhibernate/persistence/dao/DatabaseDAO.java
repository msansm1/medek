package com.devoteam.springhibernate.persistence.dao;

import java.util.List;

import com.devoteam.springhibernate.persistence.model.Database;

/**
 * Database table DAO class interface.
 * 
 * @author rbarbot
 *
 */
public interface DatabaseDAO {
	
	List<Database> findAll();

}
