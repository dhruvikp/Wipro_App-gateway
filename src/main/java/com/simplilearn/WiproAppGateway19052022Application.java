package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WiproAppGateway19052022Application {

	public static void main(String[] args) {
		SpringApplication.run(WiproAppGateway19052022Application.class, args);
	}

}
