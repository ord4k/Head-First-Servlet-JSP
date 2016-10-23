package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		//an example to simulate a code to initialize the database connection
		//and store it as a context attribute
		ServletContext sc = event.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog",d);
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		//code to close the database connection
		//nothing to do here 
	}
}