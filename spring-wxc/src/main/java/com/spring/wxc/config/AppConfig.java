package com.spring.wxc.config;

import com.spring.wxc.service.HelloService;
import com.spring.wxc.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xinchao.wang
 * @date: 2019-08-29 11:01
 * @description:
 */
@Configuration
@ComponentScan("com.spring.wxc")
public class AppConfig {
}
