package com.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
//
//	@Test
//	public void testSayHallo() {
//		assertEquals("Hallo", app.sayHello());
//	}
}
