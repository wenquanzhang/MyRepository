package com.org.business.sample.dao;

import com.org.business.sample.pojo.User;

public interface UserDao {
	
	public User getUser(User user);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int UserId);

}
