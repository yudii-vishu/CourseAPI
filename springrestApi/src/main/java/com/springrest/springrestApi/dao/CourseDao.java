package com.springrest.springrestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrestApi.entities.Course;

public interface CourseDao  extends JpaRepository<Course, Long>{

}
