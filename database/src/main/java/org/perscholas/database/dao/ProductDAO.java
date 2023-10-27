package org.perscholas.database.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Product;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class ProductDAO {
	public Product findById(Integer id) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Product p WHERE p.id = ?1"; // Example of HQL to get all records of user class
		TypedQuery<Product> query = session.createQuery(hql, Product.class);

		query.setParameter(1, id);
		try {
			Product result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;

		}

	}

	public List<Product> findByName(String nameProduct) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM Product p WHERE p.productName LIKE CONCAT('%',:name,'%')";
		TypedQuery<Product> query = session.createQuery(hql, Product.class);

		query.setParameter("name", nameProduct);

		List<Product> result = query.getResultList();
		session.close();
		return result;

	}

	public List<Product> findAll() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Product"; // Example of HQL to get all records of user class
		TypedQuery<Product> query = session.createQuery(hql, Product.class);

		List<Product> result = query.getResultList();
		return result;

	}

	public void save(Product p) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		session.saveOrUpdate(p);
		t.commit();
		session.close();
	}

}
