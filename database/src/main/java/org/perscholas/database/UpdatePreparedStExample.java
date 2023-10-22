package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatePreparedStExample {

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
			String sql = "update employees set firstname=? , lastname=? where id = ?";

			prepStmt = con.prepareStatement(sql);
			prepStmt.setString(1, "Gary");
			prepStmt.setString(2, "Larson");
			prepStmt.setLong(3, 0003);

			int rowsAffected = prepStmt.executeUpdate();

			prepStmt = con.prepareStatement("select * from employees where id=?");
			prepStmt.setInt(1, 0003);
			// execute select query
			rs = prepStmt.executeQuery();
			while (rs.next()) {
				// System.out.print(rs.getInt("lastName"));
				System.out.println(rs.getString("firstname"));
				System.out.println(rs.getString("lastname"));
				System.out.println(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
