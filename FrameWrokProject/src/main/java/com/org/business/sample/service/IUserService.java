package com.org.business.sample.service;

import java.util.List;

import com.org.business.sample.pojo.MyUser;
import com.org.business.sample.pojo.User;

public interface IUserService {
	
	public User getUserById(String userName);
	
	public List<MyUser> getAllUsers();
	
	public boolean deleteUser(int userId);
}
