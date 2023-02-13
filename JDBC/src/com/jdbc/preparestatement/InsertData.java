package com.jdbc.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			String query = "insert into weje2.student values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 15);
			pstmt.setString(2, "priya");
			pstmt.setDouble(3, 34.567);
			pstmt.execute();
			con.close();
			System.out.println("Data inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}