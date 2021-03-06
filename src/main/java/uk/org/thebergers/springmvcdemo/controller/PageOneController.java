package uk.org.thebergers.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import uk.org.thebergers.springmvcdemo.model.PageOneBean;
import uk.org.thebergers.springmvcdemo.model.PageTwoBean;

@Controller
public class PageOneController {

	@GetMapping(path = "/pageone")
	public ModelAndView display() {
		ModelAndView result = new ModelAndView();
		result.addObject("pageOneBean", new PageOneBean());
		result.setViewName("pageone");
		return result;
	}

	@PostMapping(path = "/pageone")
	public ModelAndView submit(PageOneBean pageOneBean) {
		ModelAndView result = new ModelAndView();
		PageTwoBean pageTwoBean = new PageTwoBean();
		pageTwoBean.setFirstName(pageOneBean.getFirstName());
		result.addObject("pageTwoBean", pageTwoBean);
		result.setViewName("pagetwo");
		return result;
	}
}
