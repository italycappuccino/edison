package com.edison.core.product.dao;

import java.util.List;

import com.edison.core.product.entity.City;

public interface CityDao {

    public List<City> listCityByCondition(City city);

    public Long countCityByCondition(City city);

}
