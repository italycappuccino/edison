package com.edison.schema.tags;

import java.util.Map;

import lombok.Data;

public @Data class Parent {
	
	private Map<String,Child> child;

}
