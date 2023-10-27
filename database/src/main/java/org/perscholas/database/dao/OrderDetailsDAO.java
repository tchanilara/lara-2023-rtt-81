package org.perscholas.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.OrderDetails;
import org.perscholas.database.entity.Product;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class OrderDetailsDAO {
	public OrderDetails findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetails od WHERE od.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<OrderDetails> query = session.createQuery(hql, OrderDetails.class);

		query.setParameter(1, id);
		OrderDetails result = query.getSingleResult();
		session.close();
		return result;

	}

	public OrderDetails findByIdOrderAndIdProduct(Integer idOrder, Integer idProduct) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetails od WHERE od.orderId = ?1 and od.productId = ?2"; // Example of HQL to get all
																							// records of user class
		TypedQuery<OrderDetails> query = session.createQuery(hql, OrderDetails.class);

		query.setParameter(1, idOrder);
		query.setParameter(2, idProduct);
		try {
			OrderDetails result = query.getSingleResult();
			session.close();
			return result;
		} catch (NoResultException nre) {
			return null;

		}

	}

	public void save(OrderDetails od) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		session.saveOrUpdate(od);
		t.commit();
		session.close();
	}

}
