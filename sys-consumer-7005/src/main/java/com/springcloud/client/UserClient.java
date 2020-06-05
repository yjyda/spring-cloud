package com.springcloud.client;

import com.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//调用服务名字，此处的name必须和注册中心的服务器的name一致
@FeignClient(value = "sys-provider")
@RequestMapping("/provider/sys/user")
public interface UserClient {

  @RequestMapping("/get/{id}") //user/1
  User getUser(@PathVariable("id") Long id);

}
