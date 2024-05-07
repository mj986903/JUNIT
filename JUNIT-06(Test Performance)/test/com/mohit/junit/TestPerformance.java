package com.mohit.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

// IF TEST CASE PERFORM TASK WITHIN GIVEN TIME THEN IT PASS TEST CASE OTHERWISE FAISE
// PERFORMANCE CHECK
public class TestPerformance {
	
	/* USED BEFORE JUNIT-5 / JUPITER TO CHECK PERFORMANCE
	@Test(timeout=100)
	void testSortingArray_Performance() {
		ReverseString reverse = new ReverseString();
		assertEquals("avaJ",reverse.reverseString("Java"));
	}
	*/
	
	
	@Test
	void testSortingArray_Performance() {
		SortingArray sarr = new SortingArray();
		int unSorted [] = {2,5,1};
		assertTimeout(Duration.ofMillis(7),()->sarr.sorting(unSorted));
	}
}
