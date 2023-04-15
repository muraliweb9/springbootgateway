package com.interview.test.springbootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZZuulProxy
public class SpringbootzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzuulApplication.class, args);
	}

}
