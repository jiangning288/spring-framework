package com.jn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-04-30 23:56
 **/
@Configuration
//@EnableTransactionManagement
@ComponentScan("com.jn")
//@EnableAspectJAutoProxy(exposeProxy = true)
public class AppConfig {

}
