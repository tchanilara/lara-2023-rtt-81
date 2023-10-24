package com.test.hib.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;

import jakarta.persistence.TypedQuery;

public class findUserHql {
	public void findUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM User"; // Example of HQL to get all records of user class
		TypedQuery query = session.createQuery(hql, User.class);
		List<User> results = query.getResultList();
		for (User u : results) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getFullname() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());
		}
	}

	public void findUserSelect() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		/* ------------ Example of HQL to get all the records------- */
		String hql = "SELECT u FROM User u";
		TypedQuery query = session.createQuery(hql, User.class);
		List<User> list = query.getResultList();

		for (User u : list) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getFullname() + "|" + "Email: "
					+ u.getEmail() + "|" + "password" + u.getPassword());

		}
	}
}
