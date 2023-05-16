package com.springrest.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.spring.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
