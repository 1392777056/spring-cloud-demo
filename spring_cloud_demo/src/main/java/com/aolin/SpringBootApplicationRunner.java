package com.aolin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/21 19:12
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootApplicationRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplicationRunner.class,args);

    }

}
