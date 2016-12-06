package com.apress.springrecipes.course;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCourseDso implements CourseDAO {
	private SessionFactory sessionFactory;
	
	public HibernateCourseDso() {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void store(Course course) {
			Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			try {
				tx.begin();
				session.saveOrUpdate( course );
				tx.commit();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
			}
	}

	public Course findById(Long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
