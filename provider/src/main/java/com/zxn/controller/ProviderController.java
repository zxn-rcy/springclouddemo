package com.zxn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/demo")
    public String demo(){
        return port;
    }
}
