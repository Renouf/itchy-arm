package com.itchyarm.task;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Launcher {

	private static Logger logger = LogManager.getLogger(Launcher.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Launching itchy-arm application.");
	}

}
