package uk.org.thebergers.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import uk.org.thebergers.springmvcdemo.model.PageTwoBean;

@Controller
public class PageTwoController {

	@PostMapping(path = "/pagetwo")
	public ModelAndView submit(PageTwoBean pageTwoBean) {
		ModelAndView result = new ModelAndView();
		result.addObject("pageTwoBean", pageTwoBean);
		result.setViewName("thankyou");
		return result;
	}
}
