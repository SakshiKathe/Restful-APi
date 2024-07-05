package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.entities.Course;
import com.example.restapi.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	//Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	@PutMapping("/course/{courseId}")
    public Course updateCourse(@PathVariable long courseId, @RequestBody Course updatedCourse) {
        // Set the ID of the updated course to match the path variable
        updatedCourse.setId(courseId);
        return courseService.updateCourse(updatedCourse);
    }
 

}
