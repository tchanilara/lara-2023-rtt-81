package org.perscholas.database;

import java.util.List;

import org.hibernate.Transaction;
import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class CreateAndUpdateExample {
	private CustomerDAO customerDAO = new CustomerDAO();

	public void insertCustomerExample() {
		Customer c = new Customer();
		c.setContactFirstname("Jeanne");
		c.setContactLastname("Sina");
		c.setAddressLine1("Address Line 1");
		c.setAddressLine2("Address Line 2");
		c.setCity("city");
		c.setCountry("USA");
		c.setCreditLimit(236.36);
		c.setCustomerName("Royal LLC");
		c.setPhone("232-256-5896");
		c.setPostalCode("365");
		c.setState("Georgie");

		customerDAO.save(c);

	}

	public void updateCustomerExample() {
		Customer customer = this.customerDAO.findById(520);
		if (customer != null) {
			customer.setContactFirstname("JEanne Dago");
			customer.setContactLastname("Sina Epse Tchani");

			this.customerDAO.save(customer);
		} else {
			System.out.println("Customer dors not exist");
		}
	}

	public void listQueery() {
		List<Customer> customers = this.customerDAO.findByFirstName("JEanne Dago");
		for (Customer c : customers) {
			System.out.println(c.getId() + " | " + c.getCustomerName() + " | " + c.getContactFirstname() + " | "
					+ c.getContactLastname());
		}
		System.out.println("we found "+ customers.size() + "records in the database");
	}
	

	public static void main(String[] args) {

		CreateAndUpdateExample caue = new CreateAndUpdateExample();
		// caue.insertCustomerExample();
		// caue.updateCustomerExample();
		caue.listQueery();

	}

}
