package com.mysql.jdbc.searchquery;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.establishconnection.DBConnection;
import com.mysql.jdbc.establishconnection.ReadConnectionProperties;

public class SearchTable {
	final static Logger logger =  Logger.getLogger(SearchTable.class);
	public static void main(String[] args) {
		logger.info("Inside SearchTable class");
		ReadConnectionProperties readConnectionParams = new ReadConnectionProperties();
		DBConnection connectionParams = readConnectionParams.readProperties();
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch
		 * (ClassNotFoundException e) { System.out.println(
		 * "Where is your MySQL JDBC Driver?"); e.printStackTrace(); return; }
		 */

		logger.debug("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection(connectionParams.getDatabaseTest(),
					connectionParams.getDbuser(), connectionParams.getDbpassword());
			Statement statement = (Statement) connection.createStatement();
			ResultSet result = statement.executeQuery("select * from states");
			while (result.next()) {
				int iD = result.getInt("id");
				String state = result.getString("state");
				long population = result.getLong("population");
				System.out.println(iD + "\t" + state + "\t" + population);
			}

		} catch (SQLException e) {
			logger.fatal("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
	}
}
