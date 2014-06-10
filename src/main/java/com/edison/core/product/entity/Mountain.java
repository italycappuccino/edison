package com.edison.core.product.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public @Data class Mountain {
	
	public void abc(){
		log.info("=====abc");
	}
	
	private Long id;
	private String name;
	
	public static void main(String[] args) {
		
		log.trace("===trace");
		log.debug("===debug");
		log.info("===info");
		log.warn("===warn");
		log.error("===error");
		
	}

}
