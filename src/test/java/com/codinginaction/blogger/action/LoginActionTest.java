package com.codinginaction.blogger.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginActionTest {

	@Autowired
	private LoginAction action;
	
	@Test
	public void testExecute() {
		
		action.execute();
		
	}
}
