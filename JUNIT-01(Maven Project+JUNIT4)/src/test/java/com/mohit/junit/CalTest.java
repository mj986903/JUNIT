package com.mohit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void test() {
		Cal obj = new Cal();
		int actual = obj.divide(10, 5);
		int expected = 2;
		assertEquals(expected,actual);
	}

}
