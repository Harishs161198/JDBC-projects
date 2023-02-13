package com.jdbc.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class step2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306 ? user=root&password=root";
		try {
			//step1
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			//step2
			Connection con = DriverManager.getConnection(url);
			//step3
			Statement stmt = con.createStatement();
			String query = "insert into weje2.student values (3 , 'Samita' ,12.23 )";
			//step4
			stmt.execute(query);
			//step5
			con.close();
			System.out.println("Data inserted ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
