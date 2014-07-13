package com.edison.schema.tags;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class FamilyNamespaceHandler extends NamespaceHandlerSupport{
	
	@Override
	public void init() {
		registerBeanDefinitionParser("parent", new ParentParser());
		registerBeanDefinitionParser("child", new ChildParser());
	}

}
