package com.codinginaction.blogger;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

	private Demo demo = new Demo();
	
	@Test
	public void testName() {
		final String name = "Steve";
		
		demo.setName(name);
		
		assertEquals(true, name.equals(demo.getName()));
	}
}
