package com.luban.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.FactoryBeanRegistrySupport;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-27 04:20
 **/
@Component
public class test implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new test2();
	}

	@Override
	public Class<?> getObjectType() {
		return test2.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
