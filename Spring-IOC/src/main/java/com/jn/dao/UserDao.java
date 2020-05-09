package com.jn.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-30 23:54
 **/

@Component("useDao")
public class UserDao implements dao {
	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	@Override
	public void test(){
		System.out.println("=====UserDao======test2");
	}

	@Override
	public void print() {System.out.println("=====UserDao======print");
	}
}
