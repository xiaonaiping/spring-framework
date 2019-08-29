package com.spring.wxc.service.impl;

import com.spring.wxc.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: xinchao.wang
 * @date: 2019-08-29 11:04
 * @description:
 */
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello() {
		System.out.println("hello world");
	}
}
