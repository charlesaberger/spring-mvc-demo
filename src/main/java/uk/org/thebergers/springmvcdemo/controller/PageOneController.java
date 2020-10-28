package uk.org.thebergers.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	public ModelAndView submit(PageOneBean pageOneBean, final RedirectAttributes redirectAttributes) {
		ModelAndView result = new ModelAndView();
		PageTwoBean pageTwoBean = new PageTwoBean();
		pageTwoBean.setFirstName(pageOneBean.getFirstName());
		redirectAttributes.addFlashAttribute("pageTwoBean", pageTwoBean);
		return new ModelAndView("redirect:/pagetwo");
	}
}
