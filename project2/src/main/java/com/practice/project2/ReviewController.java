package com.practice.project2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController {

    private final ReviewRepository repository;

    ReviewController(ReviewRepository repository){
        this.repository = repository;
    }

    @GetMapping("/reviews")
    public List<Review> getAllReviews(){
        return (ArrayList<Review>) this.repository.findAll();
    }

    @GetMapping("/reviews/{id}")
    public Optional<Review> getReview(@PathVariable Long id){
        return this.repository.findById(id);
    }

    @PostMapping("/reviews")
    public Review createReview(@RequestBody Review restaurantReview){
        return this.repository.save(restaurantReview);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable Long id){
        this.repository.deleteById(id);
    }

}
