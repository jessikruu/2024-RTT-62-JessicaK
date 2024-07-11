package sba.sms.services;

import jakarta.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sba.sms.Entities.Course;
import sba.sms.Entities.Student;
import sba.sms.dao.StudentI;
import sba.sms.utils.HibernateUtil;

import java.util.*;

/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 */

public class StudentService implements StudentI {

    Scanner scanner = new Scanner(System.in);


    @Override
    public List<Student> getAllStudents() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();


        try {
            List<Student> students = null;

            students = session.createQuery("from Student", Student.class).list();

            transaction.commit();

            return students;

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
    public void createStudent(Student student) {

        Transaction newStudent = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();;

            newStudent = session.beginTransaction();

            session.persist(student);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            if (newStudent != null) newStudent.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }


    }

    @Override
    public Student getStudentByEmail(String email) {


        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        String hql = "FROM Student where email = :email";

        TypedQuery<Student> query = session.createQuery(hql, Student.class);

        query.setParameter("email", email);

        try {
            Student student = query.getSingleResult();

            transaction.commit();
            return student;

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
    public boolean validateStudent(String email, String password) {
        boolean isValid = false;
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {

            transaction = session.beginTransaction();


            String hql = "FROM Student WHERE email = :email AND password = :password";

            TypedQuery<Student> query = session.createQuery(hql, Student.class);

            query.setParameter("email", email);
            query.setParameter("password", password);

            List<Student> students = query.getResultList();
            if (!students.isEmpty()) {
                isValid = true;
            } else {
                System.out.println("Please try again.");
            }

            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return isValid;


    }

    @Override
    public void registerStudentToCourse(String email, int courseId) {

        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        try {


            Student student = session.get(Student.class, email);

            boolean isRegistered = false;
            for (Course course : student.getCourses()) {
                if (course.getId() == courseId) {
                    isRegistered = true;
                    System.out.println("Course already registered, please try again");
                    break;
                }
            }

            if (!isRegistered) {

                Course course = session.get(Course.class, courseId);
                if (course != null) {
                    student.getCourses().add(course);
                    System.out.printf("successfully registered %s to %s%n", student.getName(), course.getName());
                } else {
                    throw new IllegalArgumentException("Course not found");
                }
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                System.err.println("Error registering student to course: " + e.getMessage());
            }
        } finally {
            if (session != null) {
                session.close();
            }

        }
    }

    @Override
    public List<Course> getStudentCourses(String email) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        Student student = getStudentByEmail(email);

        Set<Course> studentCourses = student.getCourses();
        List<Course> studentCoursesAsList = new ArrayList<>();

        try {
            for (Course c : studentCourses) {

                studentCoursesAsList.add(c);
            }
            transaction.commit();
            return studentCoursesAsList;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                System.err.println("Error registering student to course: " + e.getMessage());
            }
            throw e;
        } finally {
            if (session != null) {
                session.close();
            }
        }

//        return null;
    }

}



