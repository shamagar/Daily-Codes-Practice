package org.magar.controller;

import org.magar.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class CourseController
{
    //Url to get course details
    @GetMapping("/courseInfo")
    public String getCourseInfo(Model model)
    {
        Course course = new Course(1, "Java", 78.90);
        model.addAttribute("courseDetails", course);    //Model data or information along with key
        return "coursePage";    //Logical View Name

    }

    //Other Way to send data to view by using Map
    @GetMapping("/course")
    public String courseInfo(Map<String , Object> map)
    {
        map.put("id", 102);
        map.put("courseName", "Spring MVC");
        map.put("coursePrice", 4500.99);
        return "course"; //Logical view name
    }
}
