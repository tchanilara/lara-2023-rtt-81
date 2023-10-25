package org.perscholas.database;

import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailsDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetails;
import org.perscholas.database.entity.Product;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		Customer customer = customerDao.findById(103);
		System.out.println(customer.getId() + " | " + customer.getCustomerName());

		List<Customer> customerList = customerDao.findAll();
		for (Customer c : customerList) {
			System.out.println(c.getId() + " | " + c.getCustomerName());
		}

		List<Customer> customerList1 = customerDao.findByFirstName("Leslie");
		for (Customer c : customerList1) {
			System.out.println(c.getId() + " | " + c.getCustomerName()+ " | " + c.getContactFirstname()+ " | " + c.getContactLastname());
		}

		OrderDAO orderDAO = new OrderDAO();
		Order order = orderDAO.findById(10101);
		System.out.println(
				order.getId() + " | " + order.getOrderDate() + " | " + order.getStatus() + " | " + order.getComments());

		ProductDAO productDao = new ProductDAO();
		Product product = productDao.findById(1);
		System.out
				.println(product.getId() + " | " + product.getProductName() + " | " + product.getProductDescription());

		List<Product> productList = productDao.findAll();
		for (Product p : productList) {
			System.out.println(
					p.getId() + " | " + p.getProductName() + " | " + p.getProductDescription());
		}

		OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();
		OrderDetails orderDetails = orderDetailsDAO.findById(1);
		System.out.println(
				orderDetails.getId() + " | " + orderDetails.getProductId() + " | " + orderDetails.getQuantityOrdered() + " | " + orderDetails.getPriceEach());

	}

}
