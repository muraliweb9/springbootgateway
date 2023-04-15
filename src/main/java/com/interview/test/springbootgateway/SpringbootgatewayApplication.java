package com.interview.test.springbootgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootgatewayApplication.class, args);
	}

}
