package com.mohit.junit.service;

import com.mohit.junit.dao.Course;

public class PurchaseCourse {
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}
}
