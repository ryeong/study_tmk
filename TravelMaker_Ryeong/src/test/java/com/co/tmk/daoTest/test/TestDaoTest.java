package com.co.tmk.daoTest.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.co.tmk.test.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:container/spring/config/**/context-*.xml" })
public class TestDaoTest {
	@Autowired
	TestDao testDao;
	
	@Test
	public void selectTest(){
		System.out.println(testDao.testSelect());
	}
}
