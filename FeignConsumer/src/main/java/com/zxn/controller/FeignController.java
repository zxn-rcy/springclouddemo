package com.zxn.controller;

import com.zxn.feignclients.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zhuxineng
 * @date: 2020/12/25 16:09
 * @Description:
 */
@RequestMapping("/feign")
@RestController
public class FeignController {

    @Autowired
    private ProviderFeignClient providerFeignClient;

    @ResponseBody
    @RequestMapping("/demo")
    public String demo(@RequestBody String name){
        return providerFeignClient.demo(name);
    }
}
