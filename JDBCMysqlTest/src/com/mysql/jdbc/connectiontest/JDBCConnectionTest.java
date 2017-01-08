package com.mysql.jdbc.connectiontest;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.establishconnection.DBConnection;
import com.mysql.jdbc.establishconnection.ReadConnectionProperties;

public class JDBCConnectionTest {
	final static Logger logger =  Logger.getLogger(JDBCConnectionTest.class);
	public static void main(String[] args) {
		logger.info("MySQL JDBC Connection Testing");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.warn("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		logger.info("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			ReadConnectionProperties connectionConfig =  new ReadConnectionProperties();
			DBConnection connectionParams = connectionConfig.readProperties();
			connection = (Connection) DriverManager.getConnection(connectionParams.getDatabaseTest(), connectionParams.getDbuser(),
					connectionParams.getDbpassword());

		} catch (SQLException e) {
			logger.fatal("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			logger.info("You made it, take control your database now!");
		} else {
			logger.error("Failed to make connection!");
		}
	}
}
