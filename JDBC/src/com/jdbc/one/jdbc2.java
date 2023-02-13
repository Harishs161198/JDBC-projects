package com.jdbc.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");
			Connection connection = DriverManager.getConnection(url, username, password);

			Statement statement = connection.createStatement();

			String query = "delete from weje2.student where id=12";
			statement.execute(query);
			statement.close();
			connection.close();
			System.out.println("student data is delated");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
