package com.springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class Square {
	
	public Square() {
		// Do nothing
	}
	
	// returns the square times two
	public double getSquare(double z) {
		return z*z*2;
	}
	
}
