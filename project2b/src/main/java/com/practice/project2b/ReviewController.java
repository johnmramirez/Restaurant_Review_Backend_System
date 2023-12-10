package com.practice.project2b;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController {

    private final ReviewRepository repository;

    ReviewController(ReviewRepository repository){
        this.repository = repository;
    }

    @GetMapping("reviews")
    public List<Review> getAllReviews(){
        return this.repository.findAll();
    }

    @GetMapping("reviews/{id}")
    public Review getReview(@PathVariable String id){
        Review review = null;
        Optional<Review> optional = this.repository.findById(id);
        if (optional.isPresent()){
            review = optional.get();
        }
        return review;
    }

    @PostMapping("reviews")
    public Review createReview(@RequestBody Review restaurantReview){
        return this.repository.save(restaurantReview);
    }

    @DeleteMapping("reviews/{id}")
    public void deleteReview(@PathVariable String id){
        this.repository.deleteById(id);
    }

}
