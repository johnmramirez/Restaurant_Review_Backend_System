package com.practice.project3a;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Review findByRestaurantName(String restaurantName);
}
