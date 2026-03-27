package main;

import jdk.jpackage.internal.ApplicationLayout;
import service.DevOps;
import service.Java;
import service.springboot;
//import service.springboot;

public class LaunchApp {

	   
	
	  public static void main(String[] args) {
		  
		      DevOps dev = new DevOps();
		  springboot s=new springboot();
		  Java j = new Java();
		Telusko t = new Telusko(dev);
		System.out.println("**********");
		
//		telusko.setIcourses(new springboot());
		    t.setCourses(j);;
		
		Boolean status = t.buyTheCourse(2500.0);
		if(status)
			System.out.println("Course Purchased Succesfully");
		else 
		System.out.println("Failed to purchase");	
		
	}
	   
}
