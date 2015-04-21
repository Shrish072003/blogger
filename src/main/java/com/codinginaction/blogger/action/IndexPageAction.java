package com.codinginaction.blogger.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.codinginaction.blogger.Blogger;

public class IndexPageAction {

	private String name;
	private List<Blogger> bloggerList;
	
	
	public List<Blogger> getBloggerList() {
		return bloggerList;
	}

	public void setBloggerList(List<Blogger> bloggerList) {
		this.bloggerList = bloggerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// all struts logic here
	public String execute() {
 
		bloggerList = new ArrayList<Blogger>();
		bloggerList.add(makeBlogger(1));
		bloggerList.add(makeBlogger(2));
		bloggerList.add(makeBlogger(3));
		name = "Sheng";
		return "SUCCESS";
 
	}
	
	private Blogger makeBlogger(int id) {
		Blogger blogger = new Blogger();
		blogger.setId(id);
		blogger.setTitle(String.format("title-%d", id));
		blogger.setContent(String.format("content-%d", id));
		blogger.setCreateTime(new Date());
		blogger.setLastUpdated(new Date());
		blogger.setCreator("Sheng");
		blogger.setLastUpdatedBy("Sheng");
		
		return blogger;
	}
}
