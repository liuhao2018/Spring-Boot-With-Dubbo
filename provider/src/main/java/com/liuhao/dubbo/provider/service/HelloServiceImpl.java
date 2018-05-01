package com.liuhao.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuhao.dubbo.base.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService{
    @Override
    public String sayHello() {
        return "Hello Spring Boot With Dubbo";
    }
}
