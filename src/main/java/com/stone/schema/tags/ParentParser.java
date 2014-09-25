package com.stone.schema.tags;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.ManagedMap;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

public class ParentParser extends AbstractSimpleBeanDefinitionParser {
	
	protected void doParse(Element element, ParserContext parserContext,BeanDefinitionBuilder builder) {
		try {
			builder.addPropertyValue("child", parseMapElement(element,parserContext, builder));
		} catch (Exception e) {
			parserContext.getReaderContext().error("class " + Parent.class.getName() + " can not be create", element, e);
		}
	}

	@SuppressWarnings("all")
	public Map parseMapElement(Element mapEle, ParserContext parserContext, BeanDefinitionBuilder builder) {

		List entryEles = DomUtils.getChildElementsByTagName(mapEle, "child");
		ManagedMap map = new ManagedMap(entryEles.size());
		map.setMergeEnabled(true);
		map.setSource(parserContext.getReaderContext().extractSource(mapEle));

		for (Iterator it = entryEles.iterator(); it.hasNext();) {
			Element entryEle = (Element) it.next();
	
			String name = entryEle.getAttribute("name");

			map.put(name, parserContext.getDelegate().parseCustomElement(entryEle, builder.getRawBeanDefinition()));

		}

		return map;
	}

	@Override
	protected Class<Parent> getBeanClass(Element element) {
		return Parent.class;
	}

}
