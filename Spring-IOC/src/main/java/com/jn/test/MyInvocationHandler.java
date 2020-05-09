package com.jn.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-26 00:12
 **/
public class MyInvocationHandler implements InvocationHandler {
	Object target;
	public MyInvocationHandler(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("执行代理方法");
		return method.invoke(target,args);
	}
}
