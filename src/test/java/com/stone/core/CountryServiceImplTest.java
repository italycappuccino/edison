/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.stone.core;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stone.core.product.entity.City;
import com.stone.core.product.service.CountryService;

/**
 * 类CityServiceImplTest.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年8月14日 下午10:50:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CountryServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private CountryService countryService;

    @Test
    public void query() {
        City city = new City();
        city.setCountryCode("NLD");
        Long c = countryService.countCountryByCondition(city);
        System.out.println("count=" + c);
    }

    @Test
    public void query2() {
        City city = new City();
        city.setCountryCode("NLD");
        List<City> list = countryService.listCityByCondition(city);
        System.out.println(list.get(0));
    }

}
