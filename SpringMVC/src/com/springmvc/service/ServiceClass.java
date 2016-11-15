package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceClass {
	
	private static final List<ServiceClass> OBJECTS = new ArrayList<>(); // Just for bugfixing
	
	@Autowired
	TestSquare testQuad;
	
//	@Autowired
//	Square square;
	
	double x1;
	double x2;
	
	public ServiceClass() {
		// x1 = -p/2 + sqrt((p/2)² - q)
		// x2 = -p/2 - sqrt((p/2)² - q)
		OBJECTS.add(this); // Just for bugfixing
	}

	public double getX1(double p, double q) {
		double x1 = - p/2 + Math.sqrt((testQuad.getSquare(p/2)) - q);
//		double x1 = - p/2 + Math.sqrt(((p/2)*(p/2)) - q);
		return x1;
	}
	
	public double getX2(double p, double q) {
		double x2 = - p/2 - Math.sqrt(((p/2)*(p/2)) - q);
//		double x2 = - p/2 - Math.sqrt((square.getSquare(p/2)) - q);
		return x2;
	}
}
