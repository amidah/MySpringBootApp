package com.jenkins.demo.MySprintBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.demo.MySprintBootApp.controller.MyAppController;

@SpringBootTest
class MySprintBootAppApplicationTests {

	@Autowired
	MyAppController myAppController;
	
	@Test
	void contextLoads() {
		assertNotNull(myAppController);
	}
	
	@Test
	void testGetLatestNewsHeadline() {
		assertEquals("OC Supervisors Consider Gun Storage Law, Spark Constitutional Questions", myAppController.getLatestNewsHeadline());
	}
	
	@Test
	void testGetLatestNewsHeadlineNotNull() {
		assertNotNull(myAppController.getLatestNewsHeadline());
	}
}
