package com.practice.project1;

import java.util.Date;

public class RestaurantReview {

    long id;
    String restaurantName;
    int restaurantRating;
    Date visited;
    String review;

    public RestaurantReview(String restaurantName, int restaurantRating, Date visited, String review) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.visited = visited;
        this.review = review;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public int getRestaurantRating() {
        return restaurantRating;
    }

    public Date getVisited() {
        return visited;
    }

    public String getReview() {
        return review;
    }

    public long getId() {
        return id;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantRating(int restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public void setVisited(Date visited) {
        this.visited = visited;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setId(long id) {
        this.id = id;
    }
}
