package com.devoteam.springhibernate.persistence.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.devoteam.springhibernate.persistence.dao.DatabaseDAO;
import com.devoteam.springhibernate.persistence.model.Database;

/**
 * Implementation class of database DAO interface.
 * The annotations "component" and "autowired" are from Spring.
 * 
 * @author rbarbot
 *
 */
@Component
public class DataBaseDAOImpl implements DatabaseDAO {
	
	@Autowired
	private HibernateTemplate template;

	@Override
	public List<Database> findAll() {
		return template.loadAll(Database.class);
	}

}
