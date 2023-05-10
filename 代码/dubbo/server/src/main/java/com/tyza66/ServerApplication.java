package com.tyza66;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: tyza66
 * Date: 2023/05/10 12:05
 * Github: https://github.com/tyza66
 **/
@SpringBootApplication
@EnableDubbo
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
