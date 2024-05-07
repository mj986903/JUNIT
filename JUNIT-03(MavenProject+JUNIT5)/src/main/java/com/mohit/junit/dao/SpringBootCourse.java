package com.mohit.junit.dao;

public class SpringBootCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("SpringBoot Course Purchesed");
		return true;
	}

}
