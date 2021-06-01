package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
 
	public List<Course> getCourse();

	public Course getCourse(int courseid);
	
	public Course insertCourse(Course course);
}
