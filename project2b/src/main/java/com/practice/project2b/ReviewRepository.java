package com.practice.project2b;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Review findByRestaurantName(String restaurantName);
}
