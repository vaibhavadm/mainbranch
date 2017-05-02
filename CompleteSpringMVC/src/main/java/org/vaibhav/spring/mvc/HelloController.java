/**
 * 
 */
package org.vaibhav.spring.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VAIBHAVREDDYGUDDETI Apr 5, 2017
 */

/*
 * public class HelloController extends AbstractController {
 * 
 * 
 * @Override protected ModelAndView handleRequestInternal(HttpServletRequest
 * request, HttpServletResponse response) throws Exception { // TODO
 * Auto-generated method stub ModelAndView modelandView = new
 * ModelAndView("HelloPage"); modelandView.addObject(
 * "welcomeMessage","Hi User, Welcome to Spring MVC application"); return
 * modelandView; }
 * 
 * }
 */

@Controller
@RequestMapping("/greet")
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage", "Hi User, Welcome to Spring MVC application");
		return modelandView;
	}

	@RequestMapping("/welcomeAgain")
	public ModelAndView helloWorldAgain() {
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage", "Hi User, Welcome again to Spring MVC application");
		return modelandView;
	}

	// info about path variable
	@RequestMapping("/welcome/{country}/{userName}")
	public ModelAndView helloWorldWithPathParams(@PathVariable("userName") String name,
			@PathVariable("country") String country) {
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage",
				"Hi " + name + " you are from, " + country + " Welcome to Spring MVC application");
		return modelandView;
	}
	
	//FLASH-FLASH --> if you are using a map then we have to declare this annotation declaration in front controller <mvc:annotation-driven/>
	@RequestMapping("/welcomeAgain/{country}/{userName}")
	public ModelAndView helloWorldAgainWithPathParamsMap(@PathVariable Map<String, String> pathVars) {
		String countryName = pathVars.get("country"); 
		String name = pathVars.get("userName");
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage", "Hi " + name + " you are from, "
				+ countryName + "Welcome again to Spring MVC application");
		return modelandView;
	}
}