package com.jdbc.Assignmenttask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonCRUDOperation {
	public static void savePerson(int id, String name, long phone, int age, String email_id, String password) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			String query = "insert into weje2.person values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setLong(3, phone);
			preparedStatement.setInt(4, age);
			preparedStatement.setString(5, email_id);
			preparedStatement.setString(6, password);
			preparedStatement.execute();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public static void savePersonByid(int id) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			String query = "select * from weje2.person where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getLong(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
			}
			connection.close();
			System.out.println("data found");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public static void getAllPerson() {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			String query = "select * from weje2.person";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getLong(3));
				System.out.println(resultSet.getInt(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
			}
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public static void delatePerson(int id) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			String query = "delate from weje2.person where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public static void ValidatePerson(String email_id, String password) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			String query = "delate from weje2.person where email_id=?& password=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email_id);
			preparedStatement.setString(2, password);
			preparedStatement.execute();
			connection.close();
			System.out.println("Email_id and Password Present");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	public static void ValidatePerson(Long phone, String email_id) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			String query = "delate from weje2.person where ephone=?& email_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, phone);
			preparedStatement.setString(2, email_id);
			preparedStatement.execute();
			connection.close();
			System.out.println("phone and Email_id present");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
