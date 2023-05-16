package com.springrest.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.spring.dao.CourseDao;
import com.springrest.spring.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	// List<Course> list;

	public CourseServiceImpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Course(125, "Java course",
		 * "This is demo description for java course")); list.add(new Course(128,
		 * "Python course", "This is demo description for Python course"));
		 */}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {

		Course c = null;

		Course[] list = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}

		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		/*
		 * list.remove(course); list.add(course);
		 */
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		/*
		 * list.forEach(e->{ if (e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * });
		 */
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parselong) {
		// TODO Auto-generated method stub

		// this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parselong);
		courseDao.delete(entity);

	}

}
