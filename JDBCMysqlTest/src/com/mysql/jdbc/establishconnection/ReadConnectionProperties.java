package com.mysql.jdbc.establishconnection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadConnectionProperties {
	final static Logger logger =  Logger.getLogger(ReadConnectionProperties.class);
	public DBConnection readProperties() {
		logger.info("Inside readProperties method");
		DBConnection connection = new DBConnection();
		Properties prop = new Properties();
		InputStream input = null;
		try {
			String filename = "config.properties";
			input = getClass().getClassLoader().getResourceAsStream(filename);
			if (input == null) {
			logger.error ("Sorry, unable to find " + filename);
				return null;
			}

			prop.load(input);
			logger.debug("file successfully loaded!");
			/*
			 * Enumeration<?> e = prop.propertyNames(); while
			 * (e.hasMoreElements()) { String key = (String) e.nextElement();
			 * String value = prop.getProperty(key); System.out.println("Key : "
			 * + key + ", Value : " + value); }
			 */
			
			connection.setDbuser(prop.getProperty("dbuser"));
			connection.setDatabaseTest(prop.getProperty("databasetest"));
			connection.setDbpassword(prop.getProperty("dbpassword"));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			logger.fatal("Unable to read the config parameters from the properties file");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return connection;
	}
}
