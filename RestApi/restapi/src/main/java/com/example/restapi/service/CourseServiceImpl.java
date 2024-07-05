package com.example.restapi.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Service;

import com.example.restapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123,"Java Course","this course contain core java"));
		list.add(new Course(145,"Spring Boot","rest api using spring boot"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course updatedCourse) {
		for (Course course : list) {
			if (course.getId() == updatedCourse.getId()) {
				course.setTitle(updatedCourse.getTitle());
				course.setDescription(updatedCourse.getDescription());
				// You can update other properties as needed
				return course; // Return the updated course
			}
		}
		throw new RuntimeException("Course not found with id : " + updatedCourse.getId());
	}

}
