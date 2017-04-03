/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaibhav.spring.boot.starter.topic.service.TopicService;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 2, 2017
 */

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	//same as JAX-RS way of doing in jaxrs we use PathParam here we use PathVariable
	@RequestMapping("/topics/{id}")
	public Topic getSingleTopic(@PathVariable(value = "id") String id){
		return topicService.getTopic(id);
	}
}
