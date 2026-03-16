//This code shows the basic about how spring Hateoas work or provide a link to another api to get related data
/*
Spring Boot HATEOAS is a way to build REST APIs where the server returns links along with data,
allowing clients to discover actions dynamically instead of hard-coding URLs.
HATEOAS stands for Hypermedia As The Engine Of Application State, a constraint of Representational State Transfer (REST).
 */
package org.magar.springboothateoas.controller;

import org.magar.springboothateoas.model.Course;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController
{
    //Basic API to add the course info
    @GetMapping("/getjava")
    public List<Course> getJavaCourseInfo()
    {
        List courseList = new ArrayList<>();
        courseList.add(new Course(102, "Java",45.99));
        return courseList;
    }

    //API to Link above api
    @GetMapping("/getcourse/{id}")
    public ResponseEntity<Course> getCourseInfo(@PathVariable("id") Integer id)
    {
        Course course = new Course(101, "Python",99.99);

        //Link with another api to get related data
        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
                .methodOn(CourseController.class).getJavaCourseInfo()).withRel("getjava");
        course.add(link);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }

    //Another api
    @GetMapping("/getallcourse")
    public List<Course> getAllCourseInfo()
    {
        List courseList = new ArrayList<>();
        courseList.add(new Course(102, "C++", 159.99));
        courseList.add(new Course(103, "C#", 199.99));
        courseList.add(new Course(104, "Goland", 99.99));
        return courseList;
    }

    //Linking above api
    @GetMapping("/getmulti/{id}")
    public ResponseEntity<Course> getAllCourseInfo(@PathVariable Integer id)
    {
        Course course = new Course(101, "Html", 59.99);

        //Linking
        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getAllCourseInfo())
                .withRel("getallcourse");
        course.add(link);
        return new ResponseEntity<Course>(course, HttpStatus.OK);

    }
}
