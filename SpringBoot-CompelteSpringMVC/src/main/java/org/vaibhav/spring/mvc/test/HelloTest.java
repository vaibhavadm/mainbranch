/**
 * 
 */
package org.vaibhav.spring.mvc.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 5, 2017
 */
@RestController
public class HelloTest {
	@RequestMapping("/hello")
	public String testMethod(){
		return "Yes Spring-MVC project is up!";
	}
}
