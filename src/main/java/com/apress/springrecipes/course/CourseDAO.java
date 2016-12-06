package com.apress.springrecipes.course;

import java.util.List;

public interface CourseDAO {
	
	//public void delete();

	public void store(Course course);

	public Course findById(Long courseId);

	public List<Course> findAll();
	
}
