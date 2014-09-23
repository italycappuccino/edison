/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.edison.core.product.dao;

import java.util.List;

import com.edison.core.product.entity.City;

/**
 * 类MoneyDao.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年9月22日 下午2:40:20
 */
public interface MoneyDao {

    public List<City> listCityByCondition(City city);

}
