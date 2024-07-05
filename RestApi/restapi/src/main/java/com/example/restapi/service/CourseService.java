package com.example.restapi.service;

import java.util.List;

import com.example.restapi.entities.Course;

public interface CourseService {
    public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

	public Course updateCourse(Course updatedCourse);

}
