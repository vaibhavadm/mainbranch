/**
 * 
 */
package org.vaibhav.spring.boot.starter.topic.service;
import org.springframework.data.repository.CrudRepository;
import org.vaibhav.spring.boot.starter.topic.Topic;
/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 4, 2017
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
