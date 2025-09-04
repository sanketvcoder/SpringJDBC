package com.sanket.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sanket.SpringJDBC.model.Student;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(101);
        s.setName("Sanket");
        s.setMarks(95);
        System.out.println(s);
    }

}
