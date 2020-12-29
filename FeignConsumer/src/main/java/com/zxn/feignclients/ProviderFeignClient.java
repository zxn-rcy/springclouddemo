package com.zxn.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhuxineng
 * @date: 2020/12/25 16:14
 * @Description: provider 调用的声明式接口
 */
@FeignClient(name = "provider", fallback = FeignError.class)
public interface ProviderFeignClient {

    @RequestMapping("/provider/demo")
    public String demo(@RequestBody String name);
}
