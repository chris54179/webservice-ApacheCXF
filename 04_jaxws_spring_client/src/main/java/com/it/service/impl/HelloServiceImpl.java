package com.it.service.impl;

import com.it.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return name + ", Welcome..";
    }
}
