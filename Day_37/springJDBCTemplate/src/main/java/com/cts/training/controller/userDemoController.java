package com.cts.training.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.bean.UserDemo;
import com.cts.training.dao.UserDemoDAO;

public class userDemoController {

	public static void main(String[] args) {

		ApplicationContext applicationContext;

		applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
		UserDemoDAO userDAO = (UserDemoDAO) applicationContext.getBean("userDAOImpl");
//		UserDemo user = new UserDemo(13, "guru", "68231");
//		userDAO.saveUser(user); 
//		System.out.println(user);
		
		//delete
//		UserDemo user=userDAO.getUserById(13);
//		userDAO.deleteUser(user);
		
		//update
//		UserDemo user=userDAO.getUserById(12);
//		user.setUserName("syed");
//		userDAO.updateUser(user);
		
		//get all users
		List<UserDemo> user=userDAO.getAllUsers();
		System.out.println(user);

	}

}
