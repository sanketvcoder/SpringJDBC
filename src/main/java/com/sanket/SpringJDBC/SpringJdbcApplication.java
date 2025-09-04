package com.sanket.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sanket.SpringJDBC.model.Student;
import com.sanket.SpringJDBC.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(101);
        s.setName("Sanket");
        s.setMarks(95);
        System.out.println(s);

        Student s2 = context.getBean(Student.class);
        s2.setRollNo(101);
        s2.setName("Sanket");
        s2.setMarks(95);
        System.out.println(s2);

        Student s3 = context.getBean(Student.class);
        s3.setRollNo(101);
        s3.setName("Sanket");
        s3.setMarks(95);
        System.out.println(s3);

        StudentService studentService = context.getBean(StudentService.class);
        studentService.addStudent(s);
        studentService.addStudent(s2);
        studentService.addStudent(s3);

        try {
            studentService.getAllStudent();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
