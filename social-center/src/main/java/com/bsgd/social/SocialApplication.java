package com.bsgd.social;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis哪些包的文件
@MapperScan("com.bsgd.social")
public class SocialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocialApplication.class);
    }
}
