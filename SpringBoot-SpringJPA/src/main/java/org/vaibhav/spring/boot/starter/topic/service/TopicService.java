/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaibhav.spring.boot.starter.topic.Topic;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 2, 2017
 */

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepo;
	
//	private List<Topic> topics = new ArrayList<>(
//			Arrays.asList(new Topic("SpringBoot", "Spring Boot", "Spring Boot Description"),
//					new Topic("SpringMVC", "Spring MVC", "Spring MVC Description"),
//					new Topic("Jersey", "JAXRS Jersey", "Jersey API Description"),
//					new Topic("JAXWS", "JAXWS WebServices", "SOAP Description")));

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	// The below code is the Lambda expression way of extracting the result
	public Topic getTopic(String id) {
		Topic findOneTopic = topicRepo.findOne(id);
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return findOneTopic;
	}

	public Topic addTopic(Topic topic) {
		Topic savedTopic = topicRepo.save(topic);
		return savedTopic;
	}

	/**
	 * @param id
	 */
	public Topic updateTopic(String id, Topic topic) {
		return topicRepo.save(topic);

		// TODO Auto-generated method stub
		// for (int i = 0; i < topics.size(); i++) {
		// Topic t = topics.get(i);
		// if (t.getId().equals(id)) {
		// topics.set(i, topic);
		// }
		// }
		// return topic;
	}

	/**
	 * @param id
	 * @return
	 */
	public void deleteTopic(String id) {
		 topicRepo.delete(id);
		// for (int i = 0; i < topics.size(); i++) {
		// Topic t = topics.get(i);
		// if (t.getId().equals(id)) {
		// return topics.remove(i);
		//
		// }
		// }
		//
		// return null;
	}

}
