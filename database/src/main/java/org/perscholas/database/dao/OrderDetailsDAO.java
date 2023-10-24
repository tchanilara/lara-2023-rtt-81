package org.perscholas.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.OrderDetails;

import jakarta.persistence.TypedQuery;

public class OrderDetailsDAO {
	public OrderDetails findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetails od WHERE od.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<OrderDetails> query =  session.createQuery(hql, OrderDetails.class);

		query.setParameter(1, id);
		OrderDetails result = query.getSingleResult();
		return result;

	}

}

