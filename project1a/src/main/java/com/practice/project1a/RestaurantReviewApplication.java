package com.practice.project1a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestaurantReviewApplication {

	private static final Logger log = LoggerFactory.getLogger(RestaurantReviewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReviewApplication.class, args);
	}

}
