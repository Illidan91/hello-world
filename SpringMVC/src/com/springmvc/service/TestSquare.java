package com.springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class TestSquare {
	
	public TestSquare() {
		// Do nothing
	}

	// returns the square times three, so you can distinguish TestQuad from Quad
	public double getSquare(double z) {
		return z*z*3;
	}
}
