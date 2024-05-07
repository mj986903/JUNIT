package com.mohit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD) - Defualt Every Time Per method instance will be created
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Create Only one object per class before BeforeAll Method
class ShapesTest {
	// For Each Test Method Every Time NEw instance of class will be created i.e for this is 2
	ShapesTest(){
		System.out.println("Object Created");
	}
	
	Shapes shape;
	// Before all test case this method will invoke ONLY once
	// THIS IS FIRST METHOD WHICH CALLED BEFORE CREATING A INSTANCE
	// USED WHEN COMMON FOR ALL THE TEST CASES
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All Test");
	}
	
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
	
	@AfterEach
	void destory() {
		System.out.println("After Test Clean Up");
	}
	
	// After all test case this method will invoke once
	@AfterAll
	static void afterAll() {
		System.out.println("After All Test");
	}

}
