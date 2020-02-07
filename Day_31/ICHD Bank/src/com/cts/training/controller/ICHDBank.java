package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.Account;
import com.cts.training.model.Custormer;
import com.cts.training.model.FundTransfer;

public class ICHDBank {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("nameSpace.xml");

		Custormer customer = (Custormer) context.getBean("customer");
		System.out.println("Customer ID: " + customer.getId() + "\nCustomer Name: " + customer.getName());
		Account account = customer.getAccount();
		System.out.println("Account No: " + account.getAccountNumber());
		FundTransfer fund = account.getFundTransfer();
		System.out.println("Sender: " + fund.getSender() + "\nReciepient: " + fund.getRecipient() + "\nAmount: "
				+ fund.getAmount());

	}

}
