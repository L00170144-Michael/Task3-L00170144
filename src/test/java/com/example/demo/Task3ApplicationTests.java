package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Task3ApplicationTests {

	@Test
	void testWelcome() {
		Task3Application welcomeTest = new Task3Application();
		String welcomepass = welcomeTest.welcome();
		assertEquals(welcomepass, "Welcome Maria");
	}
	
	@Test
	void testGoodbye() {
		Task3Application goodbyeTest = new Task3Application();
		String goodbyepass = goodbyeTest.goodbye();
		assertEquals(goodbyepass, "Goodbye Maria");
	}
}

