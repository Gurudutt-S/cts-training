package com.cts.training.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;

public class EmployeeController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setName("gds");

//		List<String> emails=new ArrayList<String>();
//		emails.add("gds@asd.com");
//		emails.add("asd@asd.com");
//		emails.add("zsxc@asd.com");
//		emp.setEmails(emails);

//		Map<String, String> emails = new LinkedHashMap<>();
//		emails.put("Gmail_Email", "gdasdass@asd.com");
//		emails.put("Gmail_Email", "weasd@asd.com");
//		emp.setEmails(emails);
//		session.save(emp);

		PermanentEmployee pe = new PermanentEmployee();
		pe.setSalary(8732423);
		pe.setBonus(234323F);

		ContractualEmployee ce = new ContractualEmployee();
		ce.setPayPerHour(324324);
		ce.setContractPeriod(15);

		session.save(emp);
		session.save(pe);
		session.save(ce);

		tx.commit();
		session.close();
	}

}
