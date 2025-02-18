package com.example.springsecurity.Controller;

import com.example.springsecurity.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Aashish",60),
            new Student(2,"Aashish1",50)
    ));

    @GetMapping("/students")
    public List<Student>getStudents(){
        return students;

    }
    @GetMapping("/Csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

}
