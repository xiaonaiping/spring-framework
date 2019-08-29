package com.spring.wxc;

import com.spring.wxc.config.AppConfig;
import com.spring.wxc.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: xinchao.wang
 * @date: 2019-08-29 10:45
 * @description:
 */

public class WxcApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.sayHello();
	}
}
