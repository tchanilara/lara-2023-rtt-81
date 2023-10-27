package org.perscholas.database;

import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailsDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetails;
import org.perscholas.database.entity.Product;

public class CreateOrderDetails {

	private OrderDAO orderDAO = new OrderDAO();
	private OrderDetailsDAO odDAO = new OrderDetailsDAO();
	private ProductDAO productDAO = new ProductDAO();

	public void createOrderDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a product name to add to your order:");
		String nameProduct = scan.nextLine();

		List<Product> listProduct = productDAO.findByName(nameProduct);

		if (listProduct.size() == 0) {
			System.out.println("This product does not exist.");
			System.exit(0);
		} else {
			for (Product p : listProduct) {
				System.out.println("Id product " + p.getId() + " | Product Name " + p.getProductName());
			}
			System.out.println("Enter a product id to add to your order:");
			Integer idProduct = scan.nextInt();

			Product p = productDAO.findById(idProduct);
			if (p == null) {
				System.out.println("This product does not exist.");
				System.exit(1);
			} else {
				System.out.println("Enter a order id  or -1 if it is new order:");
				Integer idOrder = scan.nextInt();
				if (idOrder > 0) {
					Order o = orderDAO.findById(idOrder);

					OrderDetails od1 = odDAO.findByIdOrderAndIdProduct(idOrder, idProduct);
					if (od1 == null) {
						OrderDetails od = new OrderDetails();
						od.setOrder(o);
						od.setProduct(p);
						od.setQuantityOrdered(30);
						od.setOrderLineNumber(3);
						od.setPriceEach(55.33);

						odDAO.save(od);
						System.out.println("Order details created successfully.");
					} else {
						System.out.println("This product already added to this order.");
						System.exit(2);
					}
				} else {
					// create a new order before a new order details
					System.out.println("create a new order before a new order details.");
					System.exit(3);
				}
			}
		}

	}

	public static void main(String[] args) {
		CreateOrderDetails cod = new CreateOrderDetails();
		cod.createOrderDetails();

	}

}
