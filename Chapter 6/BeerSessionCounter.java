package com.example;
import javax.servlet.http.*;

public class BeerSessionCounter implements HttpSessionListener {
	
	static private int activeSessions;
	
	public static int getActiveSessions;
	
	public static int getActiveSessions() {
		return activeSessions;
	}
	
	public synchronized void sessionCreated(HttpSessionEvent event) {
		activeSessions++;	
	}
	
	public synchronized void sessionDestroyed(HttpSessionEvent event) {
		activeSessions--;
	}
	
}