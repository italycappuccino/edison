/*
 * Copyright 2014 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.edison.core.product.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.edison.core.common.BaseDao;
import com.edison.core.product.dao.MoneyDao;
import com.edison.core.product.entity.City;

/**
 * 类MoneyDaoImpl.java的实现描述：TODO 类实现描述
 * 
 * @author liulei 2014年9月22日 下午2:41:06
 */
@SuppressWarnings("deprecation")
@Repository
public class MoneyDaoImpl extends BaseDao implements MoneyDao {

    @SuppressWarnings("unchecked")
    @Override
    public List<City> listCityByCondition(City city) {
        return (List<City>) this.getSqlMapClientTemplate().queryForList("City.listCityByCondition", city);
    }

}
