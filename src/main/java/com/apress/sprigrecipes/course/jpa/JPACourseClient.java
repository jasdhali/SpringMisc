package com.apress.sprigrecipes.course.jpa;
import java.util.Date;
import java.util.List;

import com.apress.springrecipes.course.CourseDAOAnnotations;
import com.apress.springrecipes.course.CourseJPAAnnotations;

public class JPACourseClient {
	public JPACourseClient() {
	}
	public static void main(String[] args) {
		CourseDAOAnnotations courseDAO  = new JpaCourseDao();
		List<CourseJPAAnnotations> list = courseDAO.findAll();
		System.out.println( "All Courses ===> " + list );
		CourseJPAAnnotations course = new CourseJPAAnnotations(new Long(1) , "Core spring" , new Date(), new Date(),10);
		courseDAO.store( course );
	}	
}