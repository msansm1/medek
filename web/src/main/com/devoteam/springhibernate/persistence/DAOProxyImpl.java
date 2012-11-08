package com.devoteam.springhibernate.persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devoteam.springhibernate.persistence.dao.DatabaseDAO;
import com.devoteam.springhibernate.persistence.dao.UserDAO;
import com.devoteam.springhibernate.persistence.model.User;

@Component
public class DAOProxyImpl implements DAOProxy {

	@Autowired
	private DatabaseDAO databaseDao;

	@Autowired
	private UserDAO userDao;

	@Override
	public void createUser(User user) {
		userDao.create(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
	}

	@Override
	public Collection<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public String getDatabaseVersion() {
		return databaseDao.findAll().get(0).getVersion();
	}

	@Override
	public User getUserById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public User getUserByLogin(String login) {
		List<Object[]> res = userDao.findByLogin(login);
		for(Object[] r:res) {
			return new User(Integer.decode(r[0]+""), r[4]+"", r[5]+"", r[2]+"", r[1]+"",
					r[3]+"");
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);
	}

	@Override
	public List<User> getAllUsers(String filter, String sidx, String sord) {
		String idx = sidx;
		if (idx.equalsIgnoreCase("name") || idx.equalsIgnoreCase("admin")) {
			idx = "lastName";
		}
		else if (idx.equalsIgnoreCase("mail")) {
			idx = "email";
		}
		List<Object[]> res = userDao.findAll(filter, idx, sord);
		List<User> users = new ArrayList<User>();
		for(Object[] r:res) {
			users.add(new User(Integer.decode(r[0]+""), r[4]+"", "", r[2]+"", r[1]+"",
					r[3]+""));
		}
		return users;
	}

}
