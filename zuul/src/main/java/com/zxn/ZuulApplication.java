package com.zxn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import javax.swing.*;

/**
 * @author: zhuxineng
 * @date: 2020-12-24 16:34
 * @Description: 微服务网关启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
