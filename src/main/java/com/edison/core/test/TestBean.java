package com.edison.core.test;

import lombok.Data;

/**
 * 
 * @author Peter
 * @create 2014年7月6日
 * @TODO
 */
public @Data class TestBean {
	
	private String desc;
	
	public void init(){
		System.out.println("====TestBean init()");
	}

}
