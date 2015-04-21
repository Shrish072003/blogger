package com.codinginaction.blogger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinginaction.blogger.Blogger;
import com.codinginaction.blogger.dao.BloggerDAO;

@Service
public class BloggerService {

	@Autowired
	private BloggerDAO dao;
	
	public Blogger load( final Integer id ) {
		return dao.load(id);
	}
	
	public void update( final Blogger blogger ) { 
		dao.update(blogger);
	}
	
	public List<Blogger> list() {
		return dao.list();
	}
}
