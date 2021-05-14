package com.springrest.springrestApi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrestApi.dao.CourseDao;
import com.springrest.springrestApi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
		public CourseServiceImpl() {
//			list=new ArrayList<>();
//			list.add(new Course(14, "Java Core Course", "This course contains basic of java"));
//			list.add(new Course(10, "Spring Boot", "Creating spring boot rest API"));
		}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//
//		Course c = null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());	
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
