package com.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//通过注解的方式注入一个bean，（以前是在xml内进行注入）在消费端的控制层，才能进行注入restTemplate
@Configuration // <beans></beans>
public class CfgBean {

    @Bean //<bean class="org.springframework.web.client.RestTemplate"></bean>
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean //修改负载均衡策略,修改为随机策略，默认是轮询策略
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
