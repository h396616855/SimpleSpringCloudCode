package com.springcloud.book.ch11_1_provider_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch111ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch111ProviderServerApplication.class, args);
    }

}
