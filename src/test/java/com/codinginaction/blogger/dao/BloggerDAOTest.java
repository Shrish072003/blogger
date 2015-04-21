package com.codinginaction.blogger.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.codinginaction.blogger.Blogger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class BloggerDAOTest {

	private static final Logger logger = Logger.getLogger(BloggerDAOTest.class.getName());
	
	@Autowired
	private BloggerDAO dao;
	
	@Transactional(value="txManager")
	@Test
	public void testLoad() {
		Blogger blogger = dao.load(1);
		assertNotNull( blogger );
		assertNotNull( blogger.getTitle() );
		assertNotNull( blogger.getContent() );
		assertNotNull( blogger.getCreateTime() );
		assertNotNull( blogger.getLastUpdated() );
		assertNotNull( blogger.getCreator() );
		assertNotNull( blogger.getLastUpdatedBy() );
		logger.info("blogger loaded successfully!");
	}
	
	@Transactional(value="txManager")
	@Test
	public void testUpdate() {
		String updatedContent = "Updated Content";
		Blogger blogger = dao.load(1);
		blogger.setContent(updatedContent);
		dao.update(blogger);
		// TODO: how to flush updated content to database without session?
		logger.info("blogger updated successfully!");
	}
		
	@Transactional(value="txManager")
	@Test
	public void testList() {
		List<Blogger> list  = dao.list();
		assertTrue(list.size() > 0 );
		logger.info("blogger list fetched successfully!");
	}	
}
