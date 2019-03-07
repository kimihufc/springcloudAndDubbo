package com.yzf.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: HJL
 * @create: 2019-03-05 20:14
 */
@EnableEurekaServer
@SpringBootApplication
public class EurakeServerStart {

    public static void main(String [] args){
        SpringApplication.run(EurakeServerStart.class,args);
    }

}
