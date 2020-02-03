package com.cts.training.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -298871372932744841L;
	private int id;
	private String username;
	private String password;
	private long phone; 
	private boolean enabled;
	
	public User() {
		
	}
	
	
	public User(int id, String username, String password, long phone, boolean enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.enabled = enabled;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	
}
