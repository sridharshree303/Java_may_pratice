package pluralsite.logSys;


import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {
	static Logger logger = Logger.getLogger("pluralsite.logSys");
	public static void main(String[] args) {
		Handler h = new ConsoleHandler();
		Formatter f = new SimpleFormatter();
		h.setFormatter(f);
		logger.addHandler(h);
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"We're Logging!");
	}
	
	//Common used built in handlers
		//ConsoleHandler - writes to System.err
		//StreamHandler - writes to a network socket
		//SocketHandler - writes to a network socket
		//FileHandler - writes to 1 or more files
	//File handler 
		//FileHandler output options
			// Can output to a single file
			// Can output to a rotating set of files
	
		//Working with rotating set of files
			//Specify approximate max size in bytes
			//Specify max number of files
			//Cycles through reusing oldest file
	
	/* Filehandler pattern values
	 * 		value       meaning
	 * 		  /			./file.log
	 * 		  %t 		C:\Users\jim\Appdata\Local\Temp\file.log
	 * 		  %h		C:\Users\Jim\file.log
	 * 		  %g        file_%g.log
	 */
	
	public static void filehandlerdemo() throws SecurityException, IOException {
		FileHandler h = new FileHandler("%h/myapp_%g.log",1000,4);
			// file name , 1000 - bytes , 4 - upto 4 files 
		h.setFormatter(new SimpleFormatter());
		logger.addHandler(h);
		//code
	}
		
}





