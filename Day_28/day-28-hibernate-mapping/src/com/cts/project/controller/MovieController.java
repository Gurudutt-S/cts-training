package com.cts.project.controller;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.project.model.Actor;
import com.cts.project.model.Movie;

public class MovieController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

//		Movie movie = new Movie();
//		movie.setName("FF9");
//
//		Actor actor1 = new Actor();
//		actor1.setActorName("Vin Diesel");
//		actor1.setMovies(movie);
//
//		Actor actor2 = new Actor();
//		actor2.setActorName("John Cena");
//		actor2.setMovies(movie);
//
//		session.save(movie);
//		session.save(actor1);
//		session.save(actor2);

//		Criteria criteria = session.createCriteria(Actor.class);
//		criteria.add(Restrictions.eq("actorName", "Vin Diesel"));
//		Actor actor = (Actor) criteria.uniqueResult();
//		
//		System.out.println(actor.getActorName());
//		System.out.println(actor.getMovies());

		Criteria criteria = session.createCriteria(Movie.class);
		criteria.add(Restrictions.eq("id", 29));
		Movie movies = (Movie) criteria.uniqueResult();

		Set<Actor> actors = movies.getActors();
		for (Actor actor : actors) {
			System.out.println(actor.getActorName());
		}

		tx.commit();
		session.close();

	}

}
