package com.jspiders.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionController {
	

//	jpa..hibarnate.springs. lamda framework   
//	integration project
	

		@RequestMapping(value="/admissionForm", method= RequestMethod.GET )
		public ModelAndView helloworld() {
			ModelAndView mav=new ModelAndView("AdmissionForm");
			
			
			
			
			ArrayList<String> ar=new ArrayList<String>(); 
		
			
			return mav;
		}
//		@RequestParam("StudentName") String name,@RequestParam("Studenthobby") String hobby
		
		
		
		@RequestMapping(value="/submitAdmissionForm", method= RequestMethod.POST)
		public ModelAndView helloworld1(@ModelAttribute("std1") Student std) {
			
			ModelAndView mav=new ModelAndView("AdmissionSuccess");
			
			
			mav.addObject("msg","details submitted by you" );
					
			return mav;
		}
		
		
		
		
	}
		
	
	
	
	


