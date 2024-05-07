package com.mohit.junit.dao;

public class JunitCourse implements Course{

	@Override
	public boolean coursePurchased() {
		System.out.println("Junit Course Purchesed");
		return true;
	}

}
