/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.stone.core.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stone.core.product.dao.CountryDao;
import com.stone.core.product.dao.MoneyDao;
import com.stone.core.product.entity.City;
import com.stone.core.product.service.CountryService;

/**
 * 类CountryServiceImpl.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年9月22日 下午2:26:35
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    private CountryDao countryDao;

    @Resource
    private MoneyDao   moneyDao;

    @Override
    public List<City> listCityByCondition(City city) {
        return moneyDao.listCityByCondition(city);
    }

    @Override
    public Long countCountryByCondition(City city) {
        return countryDao.countCountryByCondition(city);
    }

}
