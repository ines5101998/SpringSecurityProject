package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"James Bond"),
            new Student(2,"mariem Jones"),
            new Student(3,"ines masmoudi")
    ) ;

    @GetMapping
    public static List<Student> getSTUDENTS() {
        System.out.println("getSTUDENTS");
        return STUDENTS;
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("registerNewStudent");
        System.out.println();
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student){
        System.out.println("updateStudent");
        System.out.println(String.format("%s %s", studentId,student));
    }
}