package com.codinginaction.blogger.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codinginaction.blogger.Blogger;

@Repository
public class BloggerDAO {

	private static final Logger logger = Logger.getLogger(BloggerDAO.class.getName());
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Blogger load( final Integer id ) {
		logger.info("About to load blogger with id:" +id);
		Session session = sessionFactory.getCurrentSession();
		Blogger blogger = (Blogger)session.load(Blogger.class, id);
		logger.info("successfully load blogger with id:" + id);
		return blogger;
	}
	
	public void update( final Blogger blogger ) {
		logger.info("About to update blogger:" + blogger);
		Session session = sessionFactory.getCurrentSession();
		session.update(blogger);
	}
	
	public List<Blogger> list() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Blogger").list();
	}
}
