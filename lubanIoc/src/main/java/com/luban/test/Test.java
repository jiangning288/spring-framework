package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.dao.IndexDao3;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-19 23:41
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cx=new AnnotationConfigApplicationContext(Appconfig.class);
		IndexDao1 bean1 = (IndexDao1) cx.getBean("IndexDao1");
		bean1.query();
//		IndexDao1 bean2 = (IndexDao1) cx.getBean("IndexDao1");
//		bean2.query();
//		Dao dao= (Dao) cx.getBean("indexDao");
//		System.out.println(dao.getClass().getName());
//		dao.query();
//		Object test2 = cx.getBean("test");
//		System.out.println(test2.getClass().getName());
	}

}
