package org.perscholas.database.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

import jakarta.persistence.TypedQuery;

public class CustomerDAO {
	public Customer findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<Customer> query =  session.createQuery(hql, Customer.class);

		query.setParameter(1, id);
		Customer result = query.getSingleResult();
		return result;

	}
	
	public List<Customer> findByFirstName(String fname) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname"; // Example of HQL to get all records of user class
		TypedQuery<Customer> query =  session.createQuery(hql, Customer.class);

		query.setParameter("firstname", fname);
		List<Customer> result = query.getResultList();
		return result;

	}
	
	
	public List<Customer> findAll() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Customer"; // Example of HQL to get all records of user class
		TypedQuery<Customer> query =  session.createQuery(hql, Customer.class);
		List<Customer> result = query.getResultList();
		return result;

	}

}
