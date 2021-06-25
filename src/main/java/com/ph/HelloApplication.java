package com.ph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-helloworld
 * @description: 引导类。 springboot项目的入口
 * @author: panhao
 * @date: 2021-06-25 20:54
 **/
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }

}
