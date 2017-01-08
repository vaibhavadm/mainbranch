package com.log4j.testing;

import org.apache.log4j.Logger;

public class Log4JTester {
	final static Logger logger = Logger.getLogger(Log4JTester.class);

	public static void main(String[] args) {
		logger.debug("This is Debug");
		logger.info("This is Info");
		logger.warn("This is Warn");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
	}
}
