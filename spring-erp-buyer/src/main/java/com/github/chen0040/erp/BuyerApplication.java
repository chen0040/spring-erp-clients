package com.github.chen0040.erp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Created by xschen on 23/10/2017.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BuyerApplication {
   public static void main(String[] args) {
      SpringApplication.run(BuyerApplication.class, args);
   }
}
