package com.stone.core.product.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stone.core.common.BaseDao;
import com.stone.core.product.dao.CityDao;
import com.stone.core.product.entity.City;

@Repository
public class CityDaoImpl extends BaseDao implements CityDao {

    @SuppressWarnings({ "unchecked", "deprecation" })
    @Override
    public List<City> listCityByCondition(City city) {
        return (List<City>) this.getSqlMapClientTemplate().queryForList("City.listCityByCondition", city);
    }

    @SuppressWarnings("deprecation")
    @Override
    public Long countCityByCondition(City city) {
        return (Long) this.getSqlMapClientTemplate().queryForObject("City.countCityByCondition", city);
    }

}
