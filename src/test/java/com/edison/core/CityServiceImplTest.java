/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.edison.core;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.edison.core.product.entity.City;
import com.edison.core.product.service.CityService;

/**
 * 类CityServiceImplTest.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年8月14日 下午10:50:08
 */
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CityServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private CityService cityService;

    @Test
    public void query() {
        City city = new City();
        city.setCountryCode("NLD");
        List<City> list = cityService.listCityByCondition(city);
        Assert.assertNotNull(list);
        System.out.println(list.get(0));
    }

}
