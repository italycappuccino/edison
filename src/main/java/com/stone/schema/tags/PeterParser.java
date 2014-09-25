package com.stone.schema.tags;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import com.stone.core.test.TestBean;

public class PeterParser implements BeanDefinitionParser {

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        // TODO Auto-generated method stub
        String id = element.getAttribute("id");
        String desc = element.getAttribute("desc");

        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(TestBean.class);
        beanDefinition.getPropertyValues().addPropertyValue("desc", desc);
        parserContext.getRegistry().registerBeanDefinition(id, beanDefinition);

        return beanDefinition;

    }

}
