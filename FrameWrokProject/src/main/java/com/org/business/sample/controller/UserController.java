package com.org.business.sample.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.business.sample.pojo.MyUser;
import com.org.business.sample.pojo.User;
import com.org.business.sample.service.IUserService;


@Controller
@RequestMapping("/app")
public class UserController {
	
	private static final String PATH = "modules/home"; 
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/welcome")
	public ModelAndView applicationStartUp(HttpServletRequest request){
//		int userId = 0;
		List<MyUser> list = this.userService.getAllUsers();
//		model.addAttribute("user", user);
		
//		boolean result = this.userService.deleteUser(16);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(PATH + "/welcome");
		return mav;
	}
}
