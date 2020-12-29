package com.zxn.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/demo/{name}")
    @ResponseBody
    public void getProviderPort(@PathVariable String name){
        String result = null;
        try {
            result = restTemplate.getForObject("http://localhost:8010/provider/demo/{name}",
                    String.class, name);
        }catch (Exception e){
            System.out.println("调用服务端异常"+e.getMessage());
        }

        System.out.println(result);
    }

}
