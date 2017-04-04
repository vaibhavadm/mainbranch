/**
 * 
 */
package org.vaibhav.spring.boot.starter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 3, 2017.
 *check Application.properties file for port
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello... from Spring Boot-Spring JPA....";
	}
}
