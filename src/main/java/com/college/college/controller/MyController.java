package com.college.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.college.entity.Course;

import com.college.college.services.CourseService;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Hi!! Welcome to official College Portal";
    }

    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    public course getCourse(long id) {
        return courseService.getCourse(id);
    }
}
