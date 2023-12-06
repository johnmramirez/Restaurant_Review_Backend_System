package com.practice.project1b;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    Review findByRestaurantName(String restaurantName);

    Review findById(long id);
}
