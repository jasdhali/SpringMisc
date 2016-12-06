package com.apress.springrecipes.course.hibernate;
import java.util.Date;
import java.util.List;

import com.apress.springrecipes.course.CourseDAOAnnotations;
import com.apress.springrecipes.course.CourseJPAAnnotations;
public class AnnotationHibernateClient {
	public AnnotationHibernateClient() {
	}
	public static void main(String[] args) {
		CourseDAOAnnotations courseDAO  = new HibernateCourseAnnotationDAO();
		//
		List<CourseJPAAnnotations> list = courseDAO.findAll();
		System.out.println( "All courses ===> " + list );
		CourseJPAAnnotations courseJPAAnnotations = new CourseJPAAnnotations(new Long(1) , "Core spring" , new Date(), new Date(),10);
		courseDAO.store(courseJPAAnnotations);		
	}	
}