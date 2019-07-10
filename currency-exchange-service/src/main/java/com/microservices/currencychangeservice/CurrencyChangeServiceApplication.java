package com.microservices.currencychangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyChangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyChangeServiceApplication.class, args);
	}

}
