package com.practice.project1a;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Review {

    String restaurantName;
    String restaurantRating;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS+HH:mm")
    Date visited;
    String review;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected Review(){}

    public Review(String restaurantName, String restaurantRating, Date visited, String review) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.visited = visited;
        this.review = review;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public Date getVisited() {
        return visited;
    }

    public String getReview() {
        return review;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public void setVisited(Date visited) {
        this.visited = visited;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "RestaurantReview{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantRating=" + restaurantRating +
                ", visited=" + visited +
                ", review='" + review + '\'' +
                ", id=" + id +
                '}';
    }

}
