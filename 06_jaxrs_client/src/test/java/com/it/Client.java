package com.it;

import com.it.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {
    @Test
    public void testSave(){
        User user = new User();
        user.setId(100);
        user.setUsername("john");
        user.setCity("tw");
        WebClient.create("http://localhost:8888/ws/userService/user")
                 .type(MediaType.APPLICATION_JSON)
                 .post(user);
    }
    @Test
    public void testGet(){
        User user =
        WebClient.create("http://localhost:8888/ws/userService/user/1")
                 .accept(MediaType.APPLICATION_JSON)
                 .get(User.class);
        System.out.println(user);
    }
}
