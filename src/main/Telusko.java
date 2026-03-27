package main;

import service.icourses;

public class Telusko {
	private icourses courses;

	public void setIcourses(icourses icourses) {
		courses = icourses;
	}
      
	

	public Telusko() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Telusko(icourses courses) {
		super();
		this.courses = courses;
	}
	
	public void setCourses(icourses courses) {
		this.courses = courses;
	}



	public Boolean buyTheCourse(Double amount) {
		return courses.getTheCourse(amount);
	}
	
}
