package com.practice.project1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @GetMapping("/reviews")
    public List<Review> getReviews(){
        return null;
    }

    @GetMapping("/reviews/{id}")
    public Review getReview(@PathVariable("id") String id){
        return null;
    }

    @PostMapping("/reviews/add")
    public void createReview(@RequestBody Review restaurantReview){

    }

}
