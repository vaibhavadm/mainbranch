/**
 * 
 */
package org.vaibhav.spring.boot.starter.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaibhav.spring.boot.starter.course.Course;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 2, 2017
 */

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;
	

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	// The below code is the Lambda expression way of extracting the result
	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}

	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}

	/**
	 * @param id
	 */
	public Course updateCourse(String id, Course course) {
		return courseRepo.save(course);
	}

	/**
	 * @param id
	 * @return
	 */
	public void deleteCourse(String id) {
		 courseRepo.delete(id);
	}

}
