package com.it;

import com.it.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setAddress("http://localhost:8888/ws/hello?wsdl");

        factory.setServiceClass(HelloService.class);

        HelloService helloService = factory.create(HelloService.class);

        System.out.println(helloService.getClass());

        String content = helloService.sayHello("test");
        System.out.println(content);

    }
}
