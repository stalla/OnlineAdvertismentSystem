package com.lavanya.designpatterns.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyLogger  {   
	
private static MyLogger logger = null;
	
	private final String logFile = "final_project_log.txt";
	private PrintWriter writer;
	
	public MyLogger() {
		try {
			FileWriter fw = new FileWriter(logFile);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public static synchronized MyLogger getInstance(){
		if(logger == null)
			logger = new MyLogger();
		return logger;
	}
	
	public void writeMessage(String str1, String str2) {
		writer.println(str1 + " " + str2);

	}
	
	public void writeMessage(String str1) {
		writer.println(str1);

	}
}
