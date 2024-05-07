package com.mohit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class TestClass {

	@Test
	void test() {
		/* FAIL
		int acutal [] = {2,4,6,8};
		int expected [] = {4,6,8,2};
		
		assertArrayEquals(expected,acutal);
		*/
		
		/* PASS
		int acutal [] = {2,4,6,8};
		int expected [] = {2,4,6,8};
		
		assertArrayEquals(expected,acutal);
		*/
		
		/* FAIL beacuase checks only refference of arrays
		int acutal [] = {2,4,6,8};
		int expected [] = {4,6,8,2};
		
		assertEquals(expected,acutal);
		*/
	}

}
