package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring boot demo controller
 *
 * @author phoenix
 * @date 2019/3/25
 */
@RestController //相当于整合了@Controller、@ResponseBody
@RequestMapping("/index")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}