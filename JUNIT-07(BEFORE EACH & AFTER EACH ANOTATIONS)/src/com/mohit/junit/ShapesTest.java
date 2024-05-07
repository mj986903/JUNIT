package com.mohit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {
	
	Shapes shape;
	// Before each test case this method will invoke i.e for this 2 time init method call
	// JUNIT-4 has Only @Before Anotation is used
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before Test");
	}

	@Test
	void testComputeSquareArea() {
		System.out.println("Actual Test Running");
	}
	
	@Test
	void testComputeCircleArea() {
		System.out.println("Actual Test Running");
	}
	
	// After each test case this method will invoke i.e for this 2 time init method call
	// Use to close Connections or cleanup or close resources
	@AfterEach
	void destory() {
		System.out.println("After Test Clean Up");
	}

}
