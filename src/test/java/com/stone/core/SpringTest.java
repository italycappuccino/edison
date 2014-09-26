/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.stone.core;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.stone.core.test.TestBean;

/**
 * 类CityServiceImplTest.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年8月14日 下午10:50:08
 */
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class SpringTest extends AbstractJUnit4SpringContextTests {

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
    public void query() {
        System.out.println(this.getBean("Peter"));
    }

    @SuppressWarnings("rawtypes")
    @Test
    public void empty() {
        Collection collection = new ArrayList();
        //collection.add(new String("aaa"));
        assertTrue(collection.isEmpty());
    }

    @Test
    public void abc() {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Parent p = (Parent)context.getBean("Peter");

        Object p = this.getBean("Peter");
        System.out.println(p);
        System.out.println("11111");
    }

    @Test
    public void ddd() {
        TestBean tb = (TestBean) this.getBean("testBean");
        System.out.println(tb.getDesc() + "-----------");
    }

    @Test
    public void peter() {
        System.out.println(this.getBean("Peter"));
    }

    @Test
    public void tag() {
        TestBean edison = (TestBean) this.getBean("edison");
        System.out.println(edison);

        TestBean lusa = (TestBean) this.getBean("lusa");
        System.out.println(lusa);
    }

}
