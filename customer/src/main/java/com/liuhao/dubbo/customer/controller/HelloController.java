package com.liuhao.dubbo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuhao.dubbo.base.service.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private IHelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }

}
