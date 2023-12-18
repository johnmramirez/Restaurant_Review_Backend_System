# Restaurant Review System

ABOUT

A microservice based backend system comprised of Java, Spring, and a datastore. The system is divided into a series of 
projects that add additional functionality.


PROJECT 1a:
A Java REST service that saves and serves anonymous restaurant reviews. Utilizes Java, Docker, Spring MVC, Spring JPA, and the 
H2 in-memory database. The application can be converted to a Docker image and deployed within a Docker container.

PROJECT 1b:
A Java REST service that saves and serves anonymous restaurant reviews. Utilizes Java, Docker, Spring MVC, and a MongoDB 
datastore. The REST service and the MongoDB database can be converted into separate Docker images and deployed within 
separate Docker containers.

PROJECT 2a:
A Java REST service that saves and serves anonymous restaurant reviews. HTTP requests are routed through an API Gateway 
to the appropriate microservice. Utilizes Java, Docker, Spring MVC, Spring Gateway, and MongoDB. The REST application, API 
Gateway, and the MongoDB database can be converted into separate Docker images and deployed within separate Docker 
containers to scale up.

PROJECT 2b:
A Java REST service that saves and serves anonymous restaurant reviews. HTTP requests are routed through an API Gateway
and a load balancer to the appropriate microservice. Utilizes Java, Docker, Spring MVC, Spring Gateway, Netflix Eureka,and 
MongoDB. The REST application, API Gateway, Eureka Server, and the MongoDB database can be converted into separate 
Docker images and deployed within separate Docker containers to scale up.

PROJECT 3a:
A Java REST service that saves and serves anonymous restaurant reviews. HTTP requests are routed through an API Gateway
and a load balancer to the appropriate microservice. The chosen microservice queries one of three MongoDB nodes for
data. Utilizes Java, Docker, Spring MVC, Spring Gateway, Netflix Eureka,and MongoDB. The REST application, API Gateway,
Eureka Server, and the MongoDB database can be converted into separate Docker images and deployed within separate Docker 
containers to scale up.
