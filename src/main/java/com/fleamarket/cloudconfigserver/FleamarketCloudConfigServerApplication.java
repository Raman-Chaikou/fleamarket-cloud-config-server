package com.fleamarket.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FleamarketCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleamarketCloudConfigServerApplication.class, args);
    }

}
