package sba.sms.services;

import jakarta.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import sba.sms.Entities.Course;
import sba.sms.Entities.Student;
import sba.sms.dao.CourseI;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
public class CourseService implements CourseI {



    @Override
    public void createCourse(Course course) {

        Transaction newCourse = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();

            newCourse = session.beginTransaction();

            session.save(course);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            if (newCourse != null) newCourse.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public Course getCourseById(int courseId) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        String hql = "FROM Course where id = :id";

        TypedQuery<Course> query = session.createQuery(hql, Course.class);

        query.setParameter("id", courseId);

        try {
            Course course = query.getSingleResult();

            transaction.commit();
            return course;

        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return null;

    }

    @Override
    public List<Course> getAllCourses() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();


        try {
            List<Course> courses = null;

            courses = session.createQuery("from Course", Course.class).list();

            transaction.commit();

            return courses;

        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return null;
    }
}
