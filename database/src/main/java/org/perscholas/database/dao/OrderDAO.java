package org.perscholas.database.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class OrderDAO {
	public Order findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<Order> query =  session.createQuery(hql, Order.class);

		query.setParameter(1, id);
		try {
		Order result = query.getSingleResult();
		return result;
		}catch (NoResultException nre) {
			return null;

		}

	}
	public List<Order> findByCustomerId(Integer customerId) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.customerId = ?1"; // Example of HQL to get all records of user class
		TypedQuery<Order> query =  session.createQuery(hql, Order.class);

		query.setParameter(1, customerId);
		List<Order> result = query.getResultList();
		return result;

	}
	
	public void save(Order o) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		session.saveOrUpdate(o);
		t.commit();

	}
	

}
