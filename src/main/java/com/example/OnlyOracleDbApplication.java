package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlyOracleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlyOracleDbApplication.class, args);
		System.out.println("Oracle APP Rumnning..");
	}

}
