/**
 * 
 */
package org.vaibhav.spring.boot.starter.course.service;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.vaibhav.spring.boot.starter.course.Course;
/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 4, 2017
 */
public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	
}
