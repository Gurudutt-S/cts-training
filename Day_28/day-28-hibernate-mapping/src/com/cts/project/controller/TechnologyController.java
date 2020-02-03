package com.cts.project.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.project.model.Developer;
import com.cts.project.model.Technology;

public class TechnologyController {

	public static void main(String[] args) {

		Configuration cgf = new Configuration();
		cgf.configure();
		SessionFactory sessionFactory = cgf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

//		Developer developer1=new Developer();
//		developer1.setName("gds");
//		Developer developer2=new Developer();
//		developer2.setName("syed");
//		Technology technology1=new Technology();
//		technology1.setLanguage("angular");
//		technology1.setExpertise("expert");
//		Technology technology2=new Technology();
//		technology2.setLanguage("hibernate");
//		technology2.setExpertise("expert");
//
//		Set<Technology> technologies=new HashSet<Technology>();
//		technologies.add(technology1);
//		technologies.add(technology2);
//		
//		developer1.setTechnology(technologies);
//		developer2.setTechnology(technologies);
//		
//		session.save(developer1);
//		session.save(developer2);

		Criteria criteria = session.createCriteria(Developer.class);
		criteria.add(Restrictions.eq("id", 38));
		Developer developer = (Developer) criteria.uniqueResult();
		System.out.println(developer.toString());

		Set<Technology> tech = developer.getTechnology();
		for (Technology technology : tech) {
			System.out.println(technology.toString());
		}

		tx.commit();
		session.close();

	}

}
