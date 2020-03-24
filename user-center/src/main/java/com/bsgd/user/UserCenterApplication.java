package com.bsgd.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
//扫描mybatis哪些包的文件
@MapperScan("com.bsgd.user")

public class UserCenterApplication {
    //启动类
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

    //引入RestTemplate
    //在spring容器中,创建一个对象,类型RestTemplate;名称/ID是方法名
    @Bean
//    引入Robin
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
