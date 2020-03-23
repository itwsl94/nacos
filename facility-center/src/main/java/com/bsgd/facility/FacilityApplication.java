package com.bsgd.facility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.bsgd.facility")
@SpringBootApplication
public class FacilityApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacilityApplication.class);
    }

}
