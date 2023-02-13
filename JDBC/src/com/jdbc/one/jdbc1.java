package com.jdbc.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username, password);

			Statement statement = connection.createStatement();

			String query = "insert into weje2.student value(13,'hari',14.14)";
			statement.execute(query);
			statement.close();
			connection.close();
			System.out.println("student data is inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
