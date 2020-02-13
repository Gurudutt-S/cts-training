package com.cts.training.bean;

import java.io.Serializable;

public class UserDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 809126889619460128L;
	private int id;
	private String userName;
	private String password;

	public UserDemo() {

	}

	public UserDemo(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDemo [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

}
