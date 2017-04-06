/**
 * 
 */
package org.vaibhav.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vaibhav.spring.mvc.Model.Person;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 5, 2017
 */
@Controller
public class PersonController {
	
	@RequestMapping("/person")
	public String person(Model model){
		Person p = new Person();
		p.setFirstName("vaibhav");
		p.setLastName("Guddeti");
		p.setAge(26);
		model.addAttribute("person", p);
		return "personView";
	}
}
