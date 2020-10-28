package uk.org.thebergers.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import uk.org.thebergers.springmvcdemo.model.PageTwoBean;

@Controller
public class ThankyouController {

	@GetMapping(path = "/thankyou")
	public ModelAndView display(@ModelAttribute("pageTwoBean")PageTwoBean pageTwoBean) {
		ModelAndView result = new ModelAndView();
		result.addObject("pageTwoBean", pageTwoBean);
		result.setViewName("thankyou");
		return result;
	}
}
