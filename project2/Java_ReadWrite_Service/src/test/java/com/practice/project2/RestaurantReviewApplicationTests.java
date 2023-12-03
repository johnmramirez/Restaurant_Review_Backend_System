package com.practice.project2;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestaurantReviewApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	public void getRequestShouldReturnReview() throws RestClientException {
		String id = "3";
		ResponseEntity<Review> response = this.restTemplate.getForEntity("http://localhost:" + port + "/reviews/" + id, Review.class);
		Review review = response.getBody();
		Assertions.assertNotNull(review);
		Assertions.assertEquals(review.getId(), Long.valueOf(id));
	}

	@Test
	public void getRequestShouldReturnNullReview() throws RestClientException {
		String id = "100";
		ResponseEntity<Review> response = this.restTemplate.getForEntity("http://localhost:" + port + "/reviews/" + id, Review.class);
		Review review = response.getBody();
		Assertions.assertNull(review);
	}

	@Test
	public void postRequestShouldReturnCreatedReview() throws RestClientException, JSONException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		JSONObject review = new JSONObject();
		review.put("restaurantName", "Test Case");
		review.put("restaurantRating", "5/5");
		review.put("visited", "9999-99-99T00:00:00.000+00:00");
		review.put("review", "Test Case Review");

		HttpEntity<String> request =
				new HttpEntity<String>(review.toString(), headers);

		ResponseEntity<Review> response = this.restTemplate.postForEntity("http://localhost:" + port + "/reviews", request, Review.class);

		Assertions.assertEquals(200, response.getStatusCode().value());
	}
}
