package com.practice.project2;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Review findByRestaurantName(String restaurantName);
}
