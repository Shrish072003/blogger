package com.codinginaction.blogger.action;

public class IndexPageAction {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// all struts logic here
	public String execute() {
 
		name = "Sheng";
		return "SUCCESS";
 
	}
}
