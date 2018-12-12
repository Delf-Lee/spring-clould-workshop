package com.elevenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
=======
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients
public class DisplayApplication {

    @Bean
<<<<<<< HEAD
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
=======
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class);
    }
}
