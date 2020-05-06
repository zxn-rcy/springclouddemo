package com.zxn.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class ConfigClientController {
    @Value("${server.port}")
    private String port;


    @Value("${foo}")
    private String foo;


    @ResponseBody
    @RequestMapping("/getConfig")
    public String getNativeConfig(){
        return port+"    "+foo;
    }

}
