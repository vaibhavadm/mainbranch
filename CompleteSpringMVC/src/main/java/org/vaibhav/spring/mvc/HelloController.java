/**
 * 
 */
package org.vaibhav.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 5, 2017
 */

/*
public class HelloController extends AbstractController {

	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage","Hi User, Welcome to Spring MVC application");
		return modelandView;
	}

}*/

@Controller
@RequestMapping("/greet")
public class HelloController{
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage","Hi User, Welcome to Spring MVC application");
		return modelandView;
	}
	
	@RequestMapping("/welcomeAgain")
	public ModelAndView helloWorldAgain(){
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage","Hi User, Welcome again to Spring MVC application");
		return modelandView;
	}
}