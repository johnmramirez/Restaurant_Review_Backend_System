# Project 1a

ABOUT:

A Spring REST service utilizing Java, Spring MVC, Spring JPA, and the H2 (SQL) in-memory database.
This service receives restaurant review data comprised of: \
Restaurant Name, Restaurant Rating, Date visited, and the customer Review.

\
DOCKER:

The entire application has been "dockerized", allowing it to be converted to a docker image
and deployed as a Docker container. See the included Dockerfile for details.


BUILDING THE JAR:

This project was compiled with Java 11. Your JAVA_HOME environment variable must be pointing to an implementation
of Java 11.

After confirming your JAVA_HOME, execute the below command within the project root:

    ./gradlew jar

The application jar will appear under /build/libs

\
CREATING THE DOCKER CONTAINER:

Execute the below command within the project root:

    docker build -t project1a:1.0.0 .


RUNNING THE DOCKER CONTAINER:

Execute the below command within the project root:

    docker run --name project1a -p 8080:8080 project1a:1.0.0



\
REQUESTS:

The REST service supports GET, POST, and DELETE operations. The README assumes you are running
the container on your local machine. Below are examples of each request:

POST REQUEST:

    URI Endpoint: http://localhost:8080/reviews
    
    POST /reviews HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json
    Content-Length: 153
    
    Response:
    {
    "restaurantName":"Test Case 2",
    "restaurantRating":"5/5",
    "visited":"2023-11-29T04:13:28.585+00:00",
    "review":"Test case review"
    }

GET REQUEST

    URI Endpoint: http://localhost:8080/reviews
    
    GET /reviews HTTP/1.1
    Host: localhost:8080
    
    Response:
    {
    {
    "restaurantName": "Platos Kitchen",
    "restaurantRating": "3/5",
    "visited": "2015-12-17T06:00:00.000+00:00",
    "review": "This place was great! The staff were friendly and knowledgeable.",
    "id": 1
    },
    {
    "restaurantName": "Platos Kitchen",
    "restaurantRating": "4/5",
    "visited": "2015-07-08T05:00:00.000+00:00",
    "review": "Food was delicious! And the owner is really friendly.",
    "id": 3
    },
    {
    "restaurantName": "Starbix",
    "restaurantRating": "3/5",
    "visited": "2015-11-09T06:00:00.000+00:00",
    "review": "Free wifi. The coffee was ok, tastes a little burnt.",
    "id": 4
    },
    {
    "restaurantName": "King Burger",
    "restaurantRating": "3/5",
    "visited": "2015-07-05T05:00:00.000+00:00",
    "review": "Food was ok, at least the restrooms were spotless.",
    "id": 5
    }
    }

GET REQUEST:

    URI Endpoint: http://localhost:8080/reviews/3
    
    GET /reviews/3 HTTP/1.1
    Host: localhost:8080
    
    Response:
    {
    "restaurantName": "Platos Kitchen",
    "restaurantRating": "4/5",
    "visited": "2015-07-08T05:00:00.000+05:00",
    "review": "Food was delicious! And the owner is really friendly.",
    "id": 3
    }
\