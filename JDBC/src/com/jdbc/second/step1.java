package com.jdbc.second;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class step1 {
	public static void main(String[] args) {
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver loaded or Registered");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
