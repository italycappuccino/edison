/**
 * 
 */
package com.edison.core.product.service;

import java.util.List;

import lombok.Data;

/**
 * @author Peter
 * @create 2014年7月13日
 * @TODO
 */
public @Data class Zoo {
	
	private Animal animal;
	
	private List all;
	
	public void add(){
		System.out.println("the animal is in the zoo and ");
		animal.info();
	}
	
	public void init(){
		System.out.println("====zoo init");
	}
	
	public void destroy(){
		System.out.println("====zoo destroy");
	}

}
