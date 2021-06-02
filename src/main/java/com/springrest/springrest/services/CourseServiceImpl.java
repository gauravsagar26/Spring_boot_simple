package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service

public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	 public CourseServiceImpl() {
		 
		 list = new ArrayList<>();
		 
		 list.add(new Course (145, "jave Core Course", "this course contains basics of java"));
		 
		 list.add(new Course(434, "spring boot course", "creating rest api using spring boot"));
		 
	 }
	
	
	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course getCourse(int courseid) {
		
		Course c =null;
		for(Course course :list)
		{
			if(course.getId()==courseid)
			{
				c=course;break;
			}
			
		}
		return c;
	}



	@Override
	public Course insertCourse(Course course) {
	
		  list.add(course);
		  return course;
	}



	@Override
	public Course updateCourse(Course course) {
		
		Course c1=null;
		for(Course c:list)
		{
			if(c.getId()==course.getId())
			{
				c.setTitle(course.getTitle());
                c.setDescription(course.getDescription());
                c1=c;
                break;
			}
			
		}
		return c1;
	}
	

  
}

