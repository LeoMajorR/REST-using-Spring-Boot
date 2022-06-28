package com.college.college.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.college.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
        List<Course> list;

        public CourseServiceImpl() {
                list = new ArrayList<Course>();
                list.add(new Course(1, "Java",
                                "Java is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(2, "Python",
                                "Python is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(3, "C++",
                                "C++ is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(4, "C#",
                                "C# is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(5, "PHP",
                                "PHP is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(6, "Ruby",
                                "Ruby is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(7, "Swift",
                                "Swift is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(8, "Kotlin",
                                "Kotlin is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(9, "Go",
                                "Go is a programming language that is used to create applications that run on a computer."));
                list.add(new Course(10, "Scala",
                                "Scala is a programming language that is used to create applications that run on a computer."));

        }

        @Override
        public List<Course> getCourses() {
                return list;
        }

        @Override
        public Course getCourse(long courseId) {
                // TODO Auto-generated method stub
                Course c = null;
                for (Course course : list) {
                        if (course.getId() == courseId) {
                                c = course;
                                break;
                        }
                }
                if (c == null) {
                        throw new RuntimeException("Course not found");
                }
                return c;
        }

        @Override
        public Course addCourse(Course course) {
                // TODO Auto-generated method stub
                list.add(course);
                return course;
        }

        @Override
        public Course updateCourse(Course course) {
                // TODO Auto-generated method stub
                for (Course c : list) {
                        if (c.getId() == course.getId()) {
                                c.setTitle(course.getTitle());
                                c.setDescription(course.getDescription());
                                break;
                        }
                }
                return course;
        }

        @Override
        public void deleteCourse(long courseId) {
                // TODO Auto-generated method stub
                for (Course c : list) {
                        if (c.getId() == courseId) {
                                list.remove(c);
                                break;
                        }
                }
        }
}
