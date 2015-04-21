package com.codinginaction.blogger.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class LoginAction implements SessionAware{

	private Map<String, Object> userSession;
	
	private String name;
//	private String password;
	
	public String execute() {
		
		name = "Sheng";
		userSession.put("userName", name);
		
		return "SUCCESS";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}
}
