package com.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	
		System.out.println("Good Bye");	
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Welcome");
		
	}

}
