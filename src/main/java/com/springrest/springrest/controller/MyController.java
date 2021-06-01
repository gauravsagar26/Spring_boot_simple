package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home()
	{
		
		return "WELOCME TO COURSES APPLICATION";
	}
	
	//GET THE COURSES
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
	     return this.courseservice.getCourse();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId )
	{
		  return this.courseservice.getCourse(Integer.parseInt(courseId));
		   
		
	}

    @PostMapping("/courses")
	public Course insertCourse(@RequestBody Course course)
	{
		
		return this.courseservice.insertCourse(course);
	}

}
 