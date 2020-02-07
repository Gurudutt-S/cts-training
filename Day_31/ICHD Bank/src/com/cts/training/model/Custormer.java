package com.cts.training.model;

import java.util.List;

import org.springframework.stereotype.Component;

//bean name will be POJO class name, starts with small letter(customer)
@Component
public class Custormer {

	private int id;
	private List<String> name;
	private Account account;

	public Custormer() {
		// TODO Auto-generated method stub

	}

	public Custormer(int id, List<String> name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Custormer [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

}
