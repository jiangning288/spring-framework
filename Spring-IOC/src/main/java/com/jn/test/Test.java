package com.jn.test;

import com.jn.config.AppConfig;
import com.jn.controller.IndexController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-30 23:54
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexController indexController = applicationContext.getBean(IndexController.class);
	}
}
