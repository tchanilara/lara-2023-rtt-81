package org.perscholas.database;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Order;

public class EqualsExample {
	
	public static void main(String[] args) {
		OrderDAO orderDao = new OrderDAO();
		
		Order o1 = orderDao.findById(10100);
		Order o2 = orderDao.findById(10101);
		Order o3 = orderDao.findById(10100);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		
	}

}
