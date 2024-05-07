package com.mohit.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testOneWord() {
		ReverseString rs = new ReverseString();
		String actual = rs.reverseString("Java");
		String expected = "avaJ";
		assertEquals(expected,actual);
	}
	
	@Test
	void testMultipleWord() {
		ReverseString rs = new ReverseString();
		assertEquals("avaJ",rs.reverseString("Java"));
		assertEquals("gnidoC",rs.reverseString("Coding"));
	}
}
