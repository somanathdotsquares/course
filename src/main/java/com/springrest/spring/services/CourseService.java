package com.springrest.spring.services;

import java.util.List;

import com.springrest.spring.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parselong);
	
	
}
