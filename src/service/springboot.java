package service;

public class springboot implements icourses {

	@Override
	public Boolean getTheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot course purchased and the price paid is"+amount);
		return true;
	}

}
