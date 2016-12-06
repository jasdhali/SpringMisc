package com.apress.springrecipes.course;

import java.util.List;

public interface CourseDAOAnnotations {
	public void delete();

	public void store(CourseJPAAnnotations course);

	public CourseJPAAnnotations findById(Long courseId);

	public List<CourseJPAAnnotations> findAll();
}
