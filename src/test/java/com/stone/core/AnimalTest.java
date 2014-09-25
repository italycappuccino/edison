/**
 * 
 */
package com.stone.core;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.stone.core.product.service.Animal;
import com.stone.core.product.service.Zoo;
import com.stone.core.product.service.impl.Bird;
import com.stone.core.test.TestBean;

/**
 * @author Peter
 * @create 2014年7月13日
 * @TODO
 */

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AnimalTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void info() {
        //Animal bird = (Bird)applicationContext.getBean("bird");
        Bird bird = (Bird) applicationContext.getBean("bird");
        bird.info();
    }

    @Test
    public void other() {
        Zoo zoo = new Zoo();
        Animal bird = (Animal) applicationContext.getBean("bird");
        zoo.setAnimal(bird);
        zoo.add();

    }

    @Test
    public void dog() {
        Zoo zoo = (Zoo) applicationContext.getBean("zoo");
        zoo.add();

        System.out.println(zoo);
    }

    @Test
    public void zs() {
        //BeanFactory applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //AbstractApplicationContext aac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean tb = (TestBean) applicationContext.getBean("edison");
        System.out.println(tb);
    }

}
