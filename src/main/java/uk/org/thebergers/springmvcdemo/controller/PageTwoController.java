package uk.org.thebergers.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import uk.org.thebergers.springmvcdemo.model.PageTwoBean;

@Controller
public class PageTwoController {

	@GetMapping(path = "/pagetwo")
	public ModelAndView display(@ModelAttribute("pageTwoBean")PageTwoBean pageTwoBean) {
		ModelAndView result = new ModelAndView();
		result.addObject("pageTwoBean", pageTwoBean);
		result.setViewName("/pagetwo");
		return result;
	}

	@PostMapping(path = "/pagetwo")
	public ModelAndView submit(PageTwoBean pageTwoBean, final RedirectAttributes redirectAttributes) {
		ModelAndView result = new ModelAndView();
		redirectAttributes.addFlashAttribute("pageTwoBean", pageTwoBean);
		result.setViewName("redirect:/thankyou");
		return result;
	}
}
