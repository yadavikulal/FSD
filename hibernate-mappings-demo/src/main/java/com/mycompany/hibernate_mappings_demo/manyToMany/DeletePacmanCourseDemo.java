package com.mycompany.hibernate_mappings_demo.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_mappings_demo.manyToMany.model.Course;
import com.mycompany.hibernate_mappings_demo.manyToMany.model.Instructor;
import com.mycompany.hibernate_mappings_demo.manyToMany.model.InstructorDetail;
import com.mycompany.hibernate_mappings_demo.manyToMany.model.Review;
import com.mycompany.hibernate_mappings_demo.manyToMany.model.Student;

public class DeletePacmanCourseDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int courseId = 2;
			Course tempCourse = session.get(Course.class, courseId);

			System.out.println("Deleting course: " + tempCourse);

			session.delete(tempCourse);

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {

			session.close();

			factory.close();
		}
	}

}
