package com.logging.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.log4j.*; 
import org.apache.log4j.Logger;

public class LoggingTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Logger log = null;
	
	public void init(ServletConfig config) throws ServletException {
		log = Logger.getRootLogger();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		log.debug("This is debug message");
		log.info("This is info message");
		log.warn("This is warn message");
		log.error("This is error message");
		log.fatal("This is fatal message");

		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Hi guys");
		pw.println("logger : " + log.getName());
	}

}
