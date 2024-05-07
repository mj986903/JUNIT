package com.mohit.junit.dao;

public class JavaCourse implements Course{

	@Override
	public boolean coursePurchased() {
		System.out.println("Java Course Purchesed");
		return true;
	}
}
