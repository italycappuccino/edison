package com.edison.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.edison.core.product.entity.TestBean;
import com.edison.schema.tags.Parent;


@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Omap extends AbstractJUnit4SpringContextTests{
	
	public <T> T getBean(Class<T> type) {
		return applicationContext.getBean(type);
	}
	
	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
	
	protected ApplicationContext getContext() {
		return applicationContext;
	}
	
	@Test
	public void empty(){
		Collection collection = new ArrayList();
		//collection.add(new String("aaa"));
		assertTrue(collection.isEmpty());
	}
	
	@Test
	public void abc(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Parent p = (Parent)context.getBean("Peter");
		
		Object p = this.getBean("Peter");
		System.out.println(p);
		System.out.println("11111");
	}
	
	@Test
	public void ddd(){
		TestBean tb = (TestBean)this.getBean("testBean");
		System.out.println(tb.getDesc()+"-----------");
	}

}
