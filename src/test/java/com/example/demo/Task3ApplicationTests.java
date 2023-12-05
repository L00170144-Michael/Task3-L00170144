package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task3ApplicationTests {

	@Test
	void testWelcome() {
		Task3Application welcomeTest = new Task3Application();
		String welcome = "Welcome!";
		String welcomepass = welcomeTest.welcome();
		assertEquals(welcome, welcomepass);
	}
}
