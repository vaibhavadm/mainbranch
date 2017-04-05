/**
 * 
 */
package org.vaibhav.spring.boot.starter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vaibhav.spring.boot.starter.course.service.CourseService;
import org.vaibhav.spring.boot.starter.topic.Topic;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 2, 2017
 */

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable(value = "topicId") String topicId) {
		return courseService.getAllCourses(topicId);
	}

	// same as JAX-RS way of doing in jaxrs we use PathParam here we use
	// PathVariable
	@RequestMapping("/topics/{topicId}/course/{courseId}")
	public Course getSingleCourse(@PathVariable(value = "courseId") String courseId) {
		return courseService.getCourse(courseId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public Course addCourse(@RequestBody Course course, @PathVariable(value="topicId") String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		return courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/course/{courseId}")
	public Course updateCourse(@PathVariable(value = "courseId") String courseId, @RequestBody Course course) {
		return courseService.updateCourse(courseId, course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{targetId}/course/{courseId}")
	public void deleteTopic(@PathVariable(value = "courseId") String courseId) {
		courseService.deleteCourse(courseId);
	}
}
