package com.mohit.junit;

import java.util.Arrays;

public class SortingArray {
	public int [] sorting(int [] arr) {
		for(int i=0;i<1000000;i++) {
			Arrays.sort(arr);
		}
		return arr;
	}
}