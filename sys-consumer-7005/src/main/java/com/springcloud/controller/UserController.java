package com.springcloud.controller;

import com.springcloud.client.UserClient;
import com.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/sys/user")
public class UserController {

    //多个方法调用只需改一处就ok
    public static  final String URL_PREFIX = "http://localhost:5005";

    //只能使用RestTemplate才能进行远程访问服务提供端所提供的资源信息（已经通过的方式注入，交给Spring进行管理了）
    @Autowired
    private RestTemplate restTemplate;

    //在路径上面随便输入的id都可以访问到对应的资源
    @RequestMapping("/get2/{id}")
    public User getUser2(@PathVariable("id")Long id){
        //调用远程服务 http请求
        String url = URL_PREFIX+"/provider/sys/user/get/"+id;
        return restTemplate.getForObject(url,User.class );
    }

    @Autowired
    private UserClient userClient;

    @RequestMapping("/get/{id}")
    public User getUser(@PathVariable("id")Long id){
        System.out.println(userClient.getClass());
        return userClient.getUser(id);
    }

}
