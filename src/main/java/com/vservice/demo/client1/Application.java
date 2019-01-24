package com.vservice.demo.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 应用启动类
 * Created by yitao on 2019/1/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
