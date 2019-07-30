package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/Wireless")
public class Wireless {
	@RequestMapping("/epson/{name}")
	public ModelAndView heloworld(@PathVariable("name") String str) {
		ModelAndView obj=new ModelAndView("hello");
		obj.addObject("msg1","oooHooooo"+str);
		return obj;
	}
}
