package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertPreparedStExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Perscholas2023";
		try {
			con = DriverManager.getConnection(dburl, user, password);
			System.out.println("Connection established successfully!");
			/* ------ Lets insert one record using a prepared statement ------ */
			String sqlQuery = "INSERT INTO EMPLOYEES (office_id,firstname,lastname,email,extension,reports_to,vacation_hours,id,job_title) VALUES (?,?,?,?,?,?,?,?,?)";
			prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setInt(1, 6);
			prepStmt.setString(2, "Nathan");
			prepStmt.setString(3, "Njienang");
			prepStmt.setString(4, "nnjienang@gmail.com");
			prepStmt.setString(5, "2571");
			prepStmt.setInt(6, 1146);
			prepStmt.setInt(7, 15);
			prepStmt.setInt(8, 0006);
			prepStmt.setString(9, "Engineer");
			int affectedRows = prepStmt.executeUpdate();
			System.out.println(affectedRows + " row(s) affected !!");

			/* ------ Lets pull data from the database for an inserted record ------ */
			// Query which needs parameters
			prepStmt = con.prepareStatement("select * from employees where id = ? ");
			prepStmt.setInt(1, 0003);
			// execute select query
			rs = prepStmt.executeQuery();
			// Display function to show the Resultset
			while (rs.next()) {
				System.out.println(rs.getString("firstname"));
				System.out.println(rs.getString("lastname"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("office_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			prepStmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
