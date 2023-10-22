package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FunctionClass {
	public Connection myConnection() throws SQLException {
		Connection con = null;
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Perscholas2023";
		try {
			con = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
