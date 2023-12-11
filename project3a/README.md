# Project 3a

ABOUT:

A Spring REST service utilizing Java, Spring MVC, Spring Cloud Gateway, Netflix Eureka Server, and a MongoDB database.
This service receives and saves restaurant review data comprised of:
Restaurant Name, Restaurant Rating, Date visited, and the customer Review.


\
DOCKER:

The entire application has been "dockerized", allowing it to be converted to a docker image
and deployed as three Docker containers. See the included docker-compose.yml for details.

\
BUILDING THE JAR:

This project was compiled with OpenJDK 17. Your JAVA_HOME environment variable must be pointing to an instance
of OpenJDK 17.

After confirming your JAVA_HOME, execute the below command within the project root:

    ./gradlew bootJar

The application jar will appear under /build/libs

\
CREATING THE DOCKER CONTAINERS:

Execute the below command within the project root:

    docker-compose up -d

**This will create three project3a containers** and pull the cloud_gateway and mongo images from the DockerHub repo. The 
cloud_gateway service container will be ready and listening on localhost:8080. The mongo-init file mounted to the mongo 
container creates a review database, review user, and inserts records into the review collection.

**The cloud_gateway service will automatically load balance REST requests between the three project3a containers. View
the container logs for these services to see the HTTP requests get balanced and routed.**


\
REQUESTS:

The REST service supports GET, POST, and DELETE operations. The README assumes you are running
the container on your local machine. Below are examples of each request:


\
GET REQUEST

    URI Endpoint: http://localhost:8080/reviews
    
    GET /reviews HTTP/1.1
    Host: localhost:8080
    
    Response:
    [
        {
        "restaurantName": "Test Document 1",
        "restaurantRating": "2/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 1",
        "id": "657376219debf638594b8b5e"
        },
        {
        "restaurantName": "Test Document 2",
        "restaurantRating": "3/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 2",
        "id": "657376219debf638594b8b5f"
        },
        {
        "restaurantName": "Test Document 3",
        "restaurantRating": "4/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 3",
        "id": "657376219debf638594b8b60"
        },
        {
        "restaurantName": "Test Document 4",
        "restaurantRating": "5/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 4",
        "id": "657376219debf638594b8b61"
        },
        {
        "restaurantName": "Test Document 5",
        "restaurantRating": "2/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 5",
        "id": "657376219debf638594b8b62"
        }
    ]

\
GET REQUEST:

    URI Endpoint: http://localhost:8080/reviews/657376219debf638594b8b62
    
    GET /reviews/3 HTTP/1.1
    Host: localhost:8080
    
    Response:
        {
        "restaurantName": "Test Document 5",
        "restaurantRating": "2/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 5",
        "id": "657376219debf638594b8b62"
        }

\
POST REQUEST:

    URI Endpoint: http://localhost:8080/reviews
    
    POST /reviews HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json

    Request Body:
    {
        "restaurantName": "Test Document 6",
        "restaurantRating": "2/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 6",
    }
    
    Response:
    {
        "restaurantName": "Test Document 6",
        "restaurantRating": "2/5",
        "visited": "2023-12-08T20:01:37.916+00:00",
        "review": "Test Review 6",
        "id": "some generated id string"
    }