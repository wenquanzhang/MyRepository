package com.org.business.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.org.business.sample.dao.UserDao;
import com.org.business.sample.dao.UserDaoManage;
import com.org.business.sample.pojo.MyUser;
import com.org.business.sample.pojo.User;
import com.org.business.sample.service.IUserService;

@Component
public class UserService implements IUserService{

	
	@Resource
	private UserDao userDao;
	
	@Resource
	private UserDaoManage daoManager;

	public User getUserById(String userName) {
		User user = new User();
		user.setUserName(userName);
		
		User uu = this.userDao.getUser(user);
		return uu;
		
	}

	public boolean deleteUser(int userId) {
		this.userDao.deleteUser(userId);
		return true;
	}

	public List<MyUser> getAllUsers() {
		List<MyUser> list = this.daoManager.getUser();
		System.out.println(list);
		return list;
	}
	

}
