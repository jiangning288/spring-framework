package com.jn.controller;

import com.jn.dao.UserDao;
import com.jn.dao.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-30 23:56
 **/
@Component
public class IndexController {
	@Autowired
	dao userDao;


	public void getDao(){
		userDao.test();
	}
	public void setUserDao1(dao userDao){
		this.userDao=userDao;
	}




}
