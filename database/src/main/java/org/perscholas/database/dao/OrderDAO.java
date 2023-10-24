package org.perscholas.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Order;

import jakarta.persistence.TypedQuery;

public class OrderDAO {
	public Order findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<Order> query =  session.createQuery(hql, Order.class);

		query.setParameter(1, id);
		Order result = query.getSingleResult();
		return result;

	}

}
