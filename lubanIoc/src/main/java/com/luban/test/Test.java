package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.dao.IndexDao3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-19 23:41
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cx=new AnnotationConfigApplicationContext();
		cx.register(Appconfig.class);
		cx.refresh();
		IndexDao1 bean1 = (IndexDao1) cx.getBean("IndexDao1");
		bean1.query();
		IndexDao1 bean2 = (IndexDao1) cx.getBean("IndexDao1");
		bean2.query();
	}

}
