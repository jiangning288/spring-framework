package com.jn.test;

import com.jn.config.AppConfig;
import com.jn.controller.IndexController;
import com.jn.dao.UserDao;
import com.jn.dao.dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

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
//		indexController.getDao();
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:Spring.xml");
//		IndexController index =(IndexController) classPathXmlApplicationContext.getBean("index");
//		index.getDao();
		UserDao userDao = new UserDao();

		//生成代理文件
//		byte[] $Proxy0s = ProxyGenerator.generateProxyClass(
//				"$Proxy0", new Class[]{dao.class}, Modifier.PUBLIC);
//		File file =new File("D://$Proxy0.class");
//		try {
		//输出
//			OutputStream outputStream= new FileOutputStream(file);
//			outputStream.write($Proxy0s);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//

//		dao proxy=(dao)Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{dao.class},new MyInvocationHandler(userDao));
//
//		proxy.test();
	}
}
