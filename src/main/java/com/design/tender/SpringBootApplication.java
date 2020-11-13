package com.design.tender;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@org.springframework.boot.autoconfigure.SpringBootApplication
@MapperScan("com.design.tender.*.mapper")
@EnableTransactionManagement
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }
}


