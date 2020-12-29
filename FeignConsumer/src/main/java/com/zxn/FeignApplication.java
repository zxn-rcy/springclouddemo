package com.zxn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: zhuxineng
 * @date: 2020-12-25 16:03
 * @Description: feign 微服务调用
 */
@SpringBootApplication
@EnableFeignClients
//@EnableHystrixDashboard
//@EnableCircuitBreaker
public class FeignApplication {
    public static void main( String[] args ) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
