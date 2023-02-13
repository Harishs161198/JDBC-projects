package com.jdbc.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,username, password);

			Statement statement = connection.createStatement();

			String query = "Select * from weje2.student";
			ResultSet rs=statement.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println("----------------------------");
			}
			statement.execute(query);
			statement.close();
			connection.close();
			System.out.println("student data is inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
