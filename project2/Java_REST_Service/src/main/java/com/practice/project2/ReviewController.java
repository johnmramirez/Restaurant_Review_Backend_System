package com.practice.project2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {



    @GetMapping("/reviews")
    public List<Review> getAllReviews(){
        return null;
    }

    @GetMapping("/reviews/{id}")
    public Review getReview(@PathVariable String id){
        return null;
    }

    @PostMapping("/reviews")
    public Review createReview(@RequestBody Review restaurantReview){
        return null;
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable String id){

    }

}
