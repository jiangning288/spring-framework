package java.com.jn.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Jiang Ning
 * @create: 2020-05-04 21:06
 **/

public class MyBeanPostProcessor implements BeanPostProcessor{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("useDao"))
			System.out.println("Before");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("useDao"))
			System.out.println("After");
		return bean;
	}
}
