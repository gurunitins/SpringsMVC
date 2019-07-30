package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/volume")
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView helloworld() {
		ModelAndView mav=new ModelAndView("Hello");
		mav.addObject("msg", "its a great day " +"\n"+
						"and my height is ");
		return mav;
	}
	
	@RequestMapping("/welcome1")
	public ModelAndView helloworld1() {
		ModelAndView mav=new ModelAndView("Hello");
		mav.addObject("msg", "what a beautiful day today is");
		return mav;
	}
}
	