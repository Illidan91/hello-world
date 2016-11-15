package com.springmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class NormalClass /*implements BeanFactoryAware, BeanNameAware*/ {

/*	private BeanFactory applicationContext;
	private String beanName;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.applicationContext = beanFactory;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}*/

	public ModelMap fillModel(ModelMap model) {
		String heading = "Spring MVC: How to Access ModelMap Values in a JSP?";
		String result1 = "Hey.. I'm NormalClass.. You are seeing me on welcome page.";
		String result2 = "Hey.. I'm NormalClass.. ";

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
