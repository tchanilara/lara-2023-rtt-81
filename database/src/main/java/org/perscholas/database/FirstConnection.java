package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstConnection {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Perscholas2023";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scan.nextLine();
		scan.close();
		try {
			con = DriverManager.getConnection(dburl, user, password);
			System.out.println("Connection established successfully!");

			String sqlQuery = "select * from employees where firstname = '"+ name +"'";
			System.out.println(sqlQuery);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(sqlQuery);

			while (result.next()) {
				String firstname = result.getString("firstname");
				String lastname = result.getString("lastname");
				String email = result.getString("email");
				Integer id = result.getInt("id");
				System.out.println(id + " | " + firstname + " | " + lastname + " | " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
