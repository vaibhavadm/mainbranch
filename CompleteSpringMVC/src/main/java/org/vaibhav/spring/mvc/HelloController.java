/**
 * 
 */
package org.vaibhav.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author VAIBHAVREDDYGUDDETI
 *Apr 5, 2017
 */
public class HelloController extends AbstractController {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelandView = new ModelAndView("HelloPage");
		modelandView.addObject("welcomeMessage","Hi User, Welcome to Spring MVC application");
		return modelandView;
	}

}
