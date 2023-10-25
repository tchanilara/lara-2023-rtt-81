package org.perscholas.database;

import java.util.Date;
import java.util.Scanner;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class App {
	private OrderDAO orderDao = new OrderDAO();
	private CustomerDAO customerDao = new CustomerDAO();

	public void createOrder(Integer customerId) {
		Customer customer = this.customerDao.findById(customerId);
		if (customer != null) {
			System.out.println("Customer name"+ customer.getCustomerName());
			Order order = new Order();
			order.setCustomerId(customerId);
			order.setStatus("ON Hold");
			order.setOrderDate(new Date());
			order.setRequiredDate(new Date());

			orderDao.save(order);

			System.out.println("Order add successfully.");
		} else {
			System.out.println("Customer does not exist");
		}
	}

	public void queryOrder() {
		Order o = orderDao.findById(10424);
		Customer c = o.getCustomer();
		System.out.println(c.getId() + " | " + c.getCustomerName() + " | " + c.getContactFirstname() + " | "
				+ c.getContactLastname());
	}

	public static void main(String[] args) {
		App app = new App();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a customer ID");
		int customerId = scan.nextInt();
		scan.close();

		app.createOrder(customerId);
		for(Order o : app.orderDao.findByCustomerId(customerId)) {
			System.out.println(o.getId() + " | " + o.getCustomerId() + " | " + o.getStatus() + " | "
					+ o.getOrderDate());
		}
		app.queryOrder();



	}

}
