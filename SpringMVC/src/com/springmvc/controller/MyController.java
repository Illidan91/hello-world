package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.service.ServiceClass;
import com.springmvc.testannotation.TestAnnotation;

@Controller
@RequestMapping("/hello")
public class MyController {

//	@Autowired
//	TestAnnotation testAnnotation;
	
	@Autowired
	ServiceClass serviceClass;
	
	@Autowired
	NormalClass normalClass;
	
//	@Autowired
//	SpringTestClass springTestClass;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		
		model = normalClass.fillModel(model);
//		model = springTestClass.fillModel(model);
//		model = testAnnotation.fillModel(model);

		double x1 = serviceClass.getX1(0.5, -1.0);
		double x2 = serviceClass.getX2(0.5, -1.0);
		String result2 = "Hey.. I have a cool number for you: " + x1 + " ; " + x2;
		model.addAttribute("result2", result2);
		
		return "test";
	}
}
