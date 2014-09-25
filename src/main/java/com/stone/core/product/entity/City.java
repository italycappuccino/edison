package com.stone.core.product.entity;

import java.util.List;

import lombok.Data;

public @Data
class City {

    private Long       id;
    private List<Long> ids;
    private String     name;
    private String     countryCode;
    private String     district;
    private String     population;
    private String     order;
    private String     by;
    private String     start;
    private String     limit;

}
