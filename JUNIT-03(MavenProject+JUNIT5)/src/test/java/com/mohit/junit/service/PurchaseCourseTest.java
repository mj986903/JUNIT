package com.mohit.junit.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mohit.junit.dao.JavaCourse;

class PurchaseCourseTest {

	@Test
	void proceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		assertTrue(pc.proceedWithCourse(new JavaCourse()));
	}

}
