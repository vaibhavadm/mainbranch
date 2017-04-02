/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 2, 2017
 */

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("1", "Spring Boot", "Spring Boot Description"),
				new Topic("2", "Spring MVC", "Spring MVC Description"),
				new Topic("3", "JAXRS Jersey", "Jersey API Description"),
				new Topic("4", "JAXWS", "SOAP Description")
				);
	}
}
