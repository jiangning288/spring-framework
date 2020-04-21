package com.luban.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("IndexDao1")
public class IndexDao1 implements ApplicationContextAware {
	ApplicationContext applicationContext;
	public IndexDao1(){

		System.out.println("dao1-init");
	}
	@PostConstruct
	public void test(){
		System.out.println("init");

	}
	public void query(){
		System.out.println("index1");
		TestDao bean = applicationContext.getBean(TestDao.class);
		System.out.println(bean);
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
}
