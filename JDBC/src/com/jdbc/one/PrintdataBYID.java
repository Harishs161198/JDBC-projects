package com.jdbc.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintdataBYID {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306";
	String username = "root";
	String password = "root";
try {
	Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection=DriverManager.getConnection(url,username,password);
	Statement statement=connection.createStatement();
	String query="select * from weje2.student where id=13";
	ResultSet rs=statement.executeQuery(query);
	while (rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getDouble(3));
		System.out.println("----------------------------");
	}
	connection.close();
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
}
}
