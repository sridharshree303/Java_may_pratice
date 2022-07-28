package pluralsite.logSys;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Demo {
	
	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		//makeLogs();
		//loglevels();
		parameterizedlogs();
	}
	
	//making logs
	public static void makeLogs() {
		logger.log(Level.INFO,"My first log message");
		logger.log(Level.INFO,"Another Message");
	}
	
	//Types of LOG methods
		// Logger supports several logging methods
		// Simple log method
		// Level convenience method
		// Precise log method
		// Precise convenience methods
		// Parameterized message methods
	
	public static void parameterizedlogs() {
		logger.log(Level.INFO,"{0} is {1} days from {2}",new Object[] {"Mon",4,"fri"});
		
	}
	
	//Logging levels
		// Each level has a numeric value
		// - 7 basic log levels
		// - 2 special levels for Logger
		// Can define custom levels
	
	public static void loglevels() {
		//logger.setLevel(Level.INFO);
		logger.setLevel(Level.ALL); // OFF
		logger.log(Level.SEVERE,"Uh Oh!!");
		logger.log(Level.INFO,"Just so you know");
		logger.log(Level.FINE,"Hey developer dude");
		logger.log(Level.FINEST,"You are special");
	}
	
	// SEVERE -- 1000  -- serious failure
	// WARNING -- 900  -- Potential problem
	// INFO  -- 800  -- General Info
	// CONFIG  -- 700  -- Configuration info
	// FINE  --  500  -- General developer info
	// FINER --  400  --  Detailed developer info
	// FINEST -- 300  -- Specialized developer info
	
}
