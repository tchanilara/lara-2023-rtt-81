package org.perscholas.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatment {
	 
	public static void main(String[] args) throws SQLException {
		FunctionClass myFunction = new FunctionClass();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first name");
		String firstname = scan.nextLine();
		System.out.println("Enter a last name");
		String lastname = scan.nextLine();
		scan.close();
		String email;
		Integer id;
		Connection con = null;
		PreparedStatement prepStmt = null;
		try {
			con = myFunction.myConnection();
			System.out.println("Connection established successfully!");

			String sqlQuery = "select * from employees where firstname = ? and lastname= ?";
			System.out.println(sqlQuery);
			prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setString(1, firstname);
			prepStmt.setString(2, lastname);
			ResultSet result = prepStmt.executeQuery();

			while (result.next()) {
				 firstname = result.getString("firstname");
				 lastname = result.getString("lastname");
				 email = result.getString("email");
				 id = result.getInt("id");
				System.out.println(id + " | " + firstname + " | " + lastname + " | " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
