package com.example.springboot2.controller;

import com.example.springboot2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2019/4/24.
 */

@Controller
public class HelloController {


    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(@RequestParam(value="msg",required=false)String msg){

        String s=helloService.hello(msg);
        return s;
    }

}
