package com.mohit.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

// IF TEST CASE THROW EXCEPTION THAT TIME TEST CASE WILL PASS OTHERWISE FAIL
public class TestException {
	@Test
	void testSortingArray_Exception() {
		/*
		try {
			SortingArray sarr = new SortingArray();
			int unSorted [] = {};
			int sorted [] = sarr.sorting(unSorted);
			for(int n : sorted) {
				System.out.print(n + " ");
			}
			fail(); //When you are explicitly fail the test case
		}catch(NullPointerException e) {
			System.out.println("Exception Generated : " + e.getMessage());
		}
		*/
		
		// DIRECT MATHOD FOR EXCEPTION
		SortingArray sarr = new SortingArray();
		int unSorted [] = null;
		assertThrows(NullPointerException.class, ()-> sarr.sorting(unSorted));
	}
}
