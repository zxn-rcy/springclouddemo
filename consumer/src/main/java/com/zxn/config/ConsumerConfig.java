package com.zxn.config;

import org.aspectj.lang.annotation.Before;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zhuxineng
 * @date: 2020-12-25 15:59
 * @Description: ribbon + RestTemplate 调用配置类
 */
@Configuration
public class ConsumerConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
