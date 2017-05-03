/**
 * 
 */
package org.vaibhav.spring.mvc.htmlform;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.vaibhav.spring.mvc.pojo.Student;

/**
 * @author VAIBHAVREDDYGUDDETI May 2, 2017
 */
@Controller
public class StudentController {
	@RequestMapping(value = "/admissionForm.htm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelandView = new ModelAndView("AdmissionForm");
		
		//modelandView.addObject("voidMsg","Welcome to Vaibhav's Spring MVC app");
		
		return modelandView;
	}
	
	@RequestMapping(value = "/submitAdmissionForm.htm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student/*@RequestParam Map<String, String> pathVars*/, BindingResult result) {
		if(result.hasErrors()){
			ModelAndView modelandView = new ModelAndView("AdmissionForm");
			return modelandView;
		}
		ModelAndView modelandView = new ModelAndView("SuccessEnrollPage");
		modelandView.addObject("msg", " Student successfully enrolled-> Student First Name: "
				+ student.getStudentFirstName() + " Last Name: " + student.getStudentLastName());
		
		/*By using @ModelAttribute annotation we can skip the bean initialization/populating the bean
		Student student1 = new Student();
		student1.setStudentFirstName(student.getStudentFirstName());
		student1.setStudentLastName(student.getStudentLastName());
		modelandView.addObject("student", student);*/
		
		//modelandView.addObject("voidMsg","Welcome to Vaibhav's Spring MVC app");
		
		return modelandView;
	}
	
	//we can observe that we are using the common data in multiple request handler methods, which can be eliminated as
	@ModelAttribute
	public void addCommonMethodsHere(Model model){
		model.addAttribute("voidMsg","Welcome to Vaibhav's Spring MVC app");
	}
}
