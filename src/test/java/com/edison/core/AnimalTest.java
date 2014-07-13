/**
 * 
 */
package com.edison.core;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.edison.core.product.service.Animal;
import com.edison.core.product.service.Zoo;
import com.edison.core.product.service.impl.Bird;

/**
 * @author Peter
 * @create 2014年7月13日
 * @TODO
 */

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class AnimalTest extends AbstractJUnit4SpringContextTests{
	
	@Test
	public void info(){
		//Animal bird = (Bird)applicationContext.getBean("bird");
		Bird bird = (Bird)applicationContext.getBean("bird");
		bird.info();
	}
	
	@Test
	public void other(){
		Zoo zoo = new Zoo();
		Animal bird = (Animal)applicationContext.getBean("bird");
		zoo.setAnimal(bird);
		zoo.add();
		
	}
	
	@Test
	public void dog(){
		Zoo zoo = (Zoo)applicationContext.getBean("zoo");
		zoo.add();
		
		System.out.println(zoo);
	}
	
	public void zs(){
		//BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
	}
	
}
