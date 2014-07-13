package com.edison.core.product.entity;

import lombok.Data;

public @Data class City {
	
	private Long id;
	private String name;
	private String countryCode;
	private String district;
	private String population;

}
