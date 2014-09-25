package com.stone.schema.tags;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class ChildParser extends AbstractSimpleBeanDefinitionParser {

	@Override
	protected void doParse(Element element, ParserContext parserContext,BeanDefinitionBuilder builder) {

		super.doParse(element, parserContext, builder);

		builder.addPropertyValue("name", element.getAttribute("name"));
		builder.addPropertyValue("age", Integer.parseInt(element.getAttribute("age")));
	}

	@Override
	protected Class<Child> getBeanClass(Element element) {
		return Child.class;
	}

}