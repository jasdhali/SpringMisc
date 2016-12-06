package com.apress.sprigrecipes.course.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.apress.springrecipes.course.CourseDAOAnnotations;
import com.apress.springrecipes.course.CourseJPAAnnotations;

public class JpaCourseDao implements CourseDAOAnnotations {

	private EntityManagerFactory entityManagerFactory;
	
	public JpaCourseDao() {
		entityManagerFactory = Persistence.createEntityManagerFactory("course");
	}

	public void delete() {
	}

	public void store(CourseJPAAnnotations course) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();		
		transaction.begin();
		entityManager.merge(course);
		transaction.commit();
		
	}

	public CourseJPAAnnotations findById(Long courseId) {
		return null;
	}

	public List<CourseJPAAnnotations> findAll() {
		return null;
	}
}
