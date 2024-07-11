package sba.sms.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sba.sms.Entities.Student;

import java.util.List;
import java.util.Set;

public class StudentServiceTest {

    private static StudentService studentService = new StudentService();
    private static final String PASSWORD = "password";


    @BeforeAll
    public static void beforeAll() {

        studentService.createStudent(new Student("reema@gmail.com", "reema brown", PASSWORD));


    }


    @ParameterizedTest
    @CsvSource(
            {"reema@gmail.com"}
    )
    public void findByEmailTest(String email) {

        //given


        //when
        Student student = studentService.getStudentByEmail(email);

        //then
        //the expected value should be on the left (first argument)
        // the actual value, which is the value returned or modified by the tested function is on the right (second argument)
        Assertions.assertNotNull(student);
        Assertions.assertEquals(email, student.getEmail());




    }


}