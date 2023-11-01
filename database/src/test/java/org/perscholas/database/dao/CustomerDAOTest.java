package org.perscholas.database.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.perscholas.database.entity.Customer;

public class CustomerDAOTest {
	
	@Test
	public void findByIdTest() {
		CustomerDAO customerDao = new CustomerDAO();
		
		Customer actual = customerDao.findById(520);
		
		Assertions.assertEquals(520, actual.getId());
		
	}

}
