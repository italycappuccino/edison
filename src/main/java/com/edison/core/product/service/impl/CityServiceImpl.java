package com.edison.core.product.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.edison.core.product.dao.CityDao;
import com.edison.core.product.dao.CountryDao;
import com.edison.core.product.entity.City;
import com.edison.core.product.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao    cityDao;

    @Resource
    private CountryDao countryDao;

    @Override
    public List<City> listCityByCondition(City city) {
        return this.cityDao.listCityByCondition(city);
    }

    @Override
    public Long countCityByCondition(City city) {
        return this.cityDao.countCityByCondition(city);
    }

    @Override
    public Long testOtherDao(City city) {
        return this.countryDao.countCountryByCondition(city);
    }

}
