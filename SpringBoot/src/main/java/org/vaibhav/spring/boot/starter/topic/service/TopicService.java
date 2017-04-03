/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.vaibhav.spring.boot.starter.topic.Topic;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 2, 2017
 */

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("SpringBoot", "Spring Boot", "Spring Boot Description"),
					new Topic("SpringMVC", "Spring MVC", "Spring MVC Description"),
					new Topic("Jersey", "JAXRS Jersey", "Jersey API Description"),
					new Topic("JAXWS", "JAXWS WebServices", "SOAP Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	// The below code is the Lambda expression way of extracting the result
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}

	/**
	 * @param id
	 */
	public Topic updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		return topic;
	}

	/**
	 * @param id
	 * @return
	 */
	public Topic deleteTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				return topics.remove(i);

			}
		}

		return null;
	}

}
