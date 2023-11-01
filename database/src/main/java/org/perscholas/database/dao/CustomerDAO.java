package org.perscholas.database.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class CustomerDAO {
	public Customer findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

		query.setParameter("id", id);
		try {
			Customer result = query.getSingleResult();
			session.close();
			return result;
		} catch (NoResultException nre) {
			session.close();
			return null;

		}

	}

	public List<Customer> findByFirstName(String fname) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname";
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

		query.setParameter("firstname", fname);

		List<Customer> result = query.getResultList();
		session.close();
		return result;

	}

	public List<Customer> findAll() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer"; // Example of HQL to get all records of user class
		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		List<Customer> result = query.getResultList();
		session.close();
		return result;

	}

	public void save(Customer c) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		session.saveOrUpdate(c);
		t.commit();
		session.close();
	}

}
