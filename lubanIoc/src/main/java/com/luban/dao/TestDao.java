package com.luban.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-20 02:42
 **/
@Component
@Scope("prototype")
public class TestDao {

	public void test(){
		System.out.println("test");
	}
}
