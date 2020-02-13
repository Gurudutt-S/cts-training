package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.UserDemo;

public interface UserDemoDAO {

	public boolean saveUser(UserDemo user);

	public boolean deleteUser(UserDemo user);

	public boolean updateUser(UserDemo user);

	public UserDemo getUserById(int id);

	public List<UserDemo> getAllUsers();

}
