package com.practice.project2;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Optional<Review> findByRestaurantName(String restaurantName);

    Optional<Review> findById(String id);
}
