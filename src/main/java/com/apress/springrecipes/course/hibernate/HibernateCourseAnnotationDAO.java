package com.apress.springrecipes.course.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.apress.springrecipes.course.CourseDAOAnnotations;
import com.apress.springrecipes.course.CourseJPAAnnotations;

public class HibernateCourseAnnotationDAO implements CourseDAOAnnotations {
	private SessionFactory sessionFactory;
	
	public HibernateCourseAnnotationDAO() {
		Configuration configuration = new AnnotationConfiguration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public void delete() {
	}

	public void store(CourseJPAAnnotations course) {
			Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			try {
				tx.begin();
				session.save( course );
				tx.commit();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
			}
	}

	public CourseJPAAnnotations findById(Long courseId) {
		return null;
	}

	public List<CourseJPAAnnotations> findAll() {
		Session session = sessionFactory.openSession();
		List<CourseJPAAnnotations> list = null;
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			list = (List<CourseJPAAnnotations>)session.createQuery("from CourseJPAAnnotations c").list();
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally{
			
		}
		return list;
	}
	
}
