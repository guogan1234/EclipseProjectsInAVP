package com.gg.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.gg.spring.bean.HelloWorld;
 
/**
 * 测试类
 * @author sjf0115
 *
 */
public class Test {
 
	private static ApplicationContext context;
	private static HelloWorld helloWorld;
	
	public static void main(String[] args) {
		//一、Spring框架调用方式
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. 从IOC容器中获取Bean实例
		helloWorld = (HelloWorld)context.getBean("helloworld");
		// 3.调用sayHello方法
		helloWorld.sayHello();
		
		//二、普通操作方式
//		helloWorld = new HelloWorld();
//		helloWorld.sayHello();
	}
}
