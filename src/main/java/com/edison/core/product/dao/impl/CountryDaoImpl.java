package com.edison.core.product.dao.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.edison.core.product.dao.CountryDao;
import com.edison.core.product.entity.City;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class CountryDaoImpl implements CountryDao {

    @Autowired
    @Qualifier("sqlMapClient")
    private SqlMapClient sqlMapClient;

    @Override
    public Long countCountryByCondition(City city) {
        Long count = 0l;
        try {
            count = (Long) this.sqlMapClient.queryForObject("City.countCityByCondition", city);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return count;
    }

}
