package com.zxn.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remote")
public class ConfigClientController {
//    @Value("${server.port}")
    private String port = "1";


    @ResponseBody
    @RequestMapping("/getConfig")
    public String getNativeConfig(){
        return this.port;
    }

}
