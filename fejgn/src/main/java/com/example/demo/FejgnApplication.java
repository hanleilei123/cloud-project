package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //RPC扫描
public class FejgnApplication {

	public static void main(String[] args) {
		SpringApplication.run(FejgnApplication.class, args);
	}
	@Bean
	@LoadBalanced
	@Autowired
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
