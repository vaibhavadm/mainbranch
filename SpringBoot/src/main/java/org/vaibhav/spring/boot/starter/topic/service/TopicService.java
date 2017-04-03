/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.vaibhav.spring.boot.starter.topic.Topic;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 2, 2017
 */

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("SpringBoot", "Spring Boot", "Spring Boot Description"),
			new Topic("SpringMVC", "Spring MVC", "Spring MVC Description"),
			new Topic("Jersey", "JAXRS Jersey", "Jersey API Description"),
			new Topic("JAXWS", "JAXWS WebServices", "SOAP Description")
			);
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
}
