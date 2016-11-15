package com.springmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class SpringTestClass {
	public ModelMap fillModel(ModelMap model) {
		String heading = "Spring MVC: How to Access ModelMap Values in a JSP?";
		String result1 = "Hey.. I'm SpringTestClass.. You are seeing me on welcome page.";
		String result2 = "Hey.. I'm SpringTestClass.. ";
 
		String credit = "Demo by Crunchify.";
 
		// you can add any Collection Objects to ModelMap
		// including JSON, String, Array, Map, List, etc...
		model.addAttribute("heading", heading);
		model.addAttribute("result1", result1);
		model.addAttribute("result2", result2);
		model.addAttribute("credit", credit);
		return model;
	}
}
