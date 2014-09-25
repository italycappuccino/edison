package com.stone.core.product.dao;

import java.util.List;

import com.stone.core.product.entity.City;

public interface CityDao {

    public List<City> listCityByCondition(City city);

    public Long countCityByCondition(City city);

}
