package com.mysql.jdbc.searchquery;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SearchTable {
	public static void main(String[] args) {
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/us_states?useSSL=false",
					"root", "0447");
			Statement statement = (Statement) connection.createStatement();
			ResultSet result = statement.executeQuery("select * from states");
			while (result.next()) {
				int iD = result.getInt("id");
				String state = result.getString("state");
				long population = result.getLong("population");
				System.out.println(iD + "\t" + state + "\t" + population);
			}

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
	}
}
