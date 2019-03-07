package com.yzf.visualboardtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: HJL
 * @create: 2019-03-05 19:28
 */
@SpringBootApplication
@EnableEurekaClient
public class VisualBoardTaskApplication {

    public static void main(String[] args){
        SpringApplication.run(VisualBoardTaskApplication.class,args);
    }

}
