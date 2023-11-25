package com.practice.project1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @GetMapping("/reviews")
    public List<RestaurantReview> getReviews(){
        return null;
    }

    @GetMapping("/reviews/{id}")
    public RestaurantReview getReview(@PathVariable("id") String id){
        return null;
    }

    @PostMapping("/reviews/add")
    public void createReview(@RequestBody RestaurantReview restaurantReview){

    }

}
