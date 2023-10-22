package org.perscholas.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderProductsExample {

	public static void main(String[] args) throws SQLException {
		// 1) Create a connection to the database classic_models
		FunctionClass myFunction = new FunctionClass();

		// 2) Use the scanner to take input of an order number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a order number");
		int numberOrder = scan.nextInt();
		scan.close();
		// 3) Write a query using a prepared statement to print out the product_id,
		// product name,
		// quantity ordered, msrp, buy_price, margin (msrp-buy_price), and total margin
		// (margin * quantity ordered)
		// try to make the output look nice

		String name;
		Double msrp, margin, totalMargin = 0.00;
		Integer id, qty;
		Connection con = null;
		PreparedStatement prepStmt = null;
		try {
			con = myFunction.myConnection();
			System.out.println("Connection established successfully!");

			String sqlQuery = "select p.id as ID, p.product_name as Name, od.quantity_ordered as Quantity, p.msrp as Msrp, ";
					sqlQuery += "( p.msrp - p.buy_price) as Margin from products as p, orderdetails as od ";
					sqlQuery += "where p.id = od.product_id and od.id = ?";
			prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setInt(1, numberOrder);
			ResultSet result = prepStmt.executeQuery();

			while (result.next()) {
				id = result.getInt("ID");
				qty = result.getInt("Quantity");
				msrp = result.getDouble("Msrp");
				margin = result.getDouble("Margin");
				name = result.getString("Name");
				System.out.println(id + " | " + name + " | " + qty + " | " + msrp+ " | " + margin + " | " + margin *qty);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		// DOUBLE BONUS
		// 4) use a java variable to calculate the total margin for the entire order
		// (all products)
		try {
			con = myFunction.myConnection();
			System.out.println("Connection established successfully!");

			String sqlQuery = "select od.quantity_ordered as Quantity, ( p.msrp - p.buy_price) as Margin ";
					sqlQuery += "from products as p, orderdetails as od ";
					sqlQuery += "where p.id = od.product_id";
			prepStmt = con.prepareStatement(sqlQuery);
			ResultSet result = prepStmt.executeQuery();

			while (result.next()) {
				qty = result.getInt("Quantity");
				margin = result.getDouble("Margin");
				totalMargin += margin*qty;
			}

			System.out.printf("The total margin for the entire order is:%.2f " , totalMargin );

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

}
