package com.practice.project2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReviewApplication.class, args);
	}

}
