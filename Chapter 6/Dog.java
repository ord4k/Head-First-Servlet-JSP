package com.example;
import javax.servlet.http.*;
import java.io.*;

public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {
	private String breed;
	//imagine more instance variables, iuncluding
	//some that are not Serializable
	
	//imagine constructor anbd other getter.setter methods
	
	public Dog(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		// code to run now that i Know I'm in a session
	}
	
	public void valueUnbound(HttpSessionBindingEvent event) {
		//clode to run now that I know I am no Longer partof session
	}
	
	public void sessionWillPassivate(HttpSessionEvent event) {
		//code to get my non-Serializable fields in a state that can survive the move to a new VM
	}
	
	public void sessionDidActivate(HttSessionEvent event) {
		//code to restore my fields...to redo whatever I undid
		// in sessionWillPassivate
	}
}