package com.edison.schema.tags;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class PeterNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        // TODO Auto-generated method stub
        registerBeanDefinitionParser("children", new PeterParser());
    }

}
