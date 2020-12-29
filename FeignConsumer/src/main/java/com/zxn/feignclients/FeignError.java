package com.zxn.feignclients;

import org.springframework.stereotype.Component;

/**
 * @author: zhuxineng
 * @date: 2020/12/25 16:29
 * @Description:
 */
@Component
public class FeignError implements ProviderFeignClient{
    @Override
    public String demo(String name) {
        return "服务器维护中...";
    }
}
