package com.edison.core.product.service;

import java.util.List;

import com.edison.core.product.entity.City;

public interface CityService {
    public List<City> listCityByCondition(City city);

    public Long countCityByCondition(City city);

    public Long testOtherDao(City city);
}
