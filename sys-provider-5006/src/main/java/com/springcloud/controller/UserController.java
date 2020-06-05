package com.springcloud.controller;

import com.springcloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {

        User user = new User();
        if (id == 1) {
            user.setAge(20);
            user.setName("zhangsan");
            user.setUsername("zhangsan");
            user.setId(1L);
            user.setBalance(800D);
        } else {
            user.setAge(18);
            user.setName("lisi");
            user.setUsername("lisi");
            user.setId(2L);
            user.setBalance(2000D);
        }
        return user;
    }

}
