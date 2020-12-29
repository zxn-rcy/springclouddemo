package com.zxn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/demo")
    public String demo(@RequestBody String name){
        return name + "获得了" + port;
    }
}
