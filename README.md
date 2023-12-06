# Restaurant Review System

ABOUT

A microservice based backend system comprised of Java, Spring, and a datastore. The system is divided into a series of projects
that add additional functionality.


PROJECT 1a:
A Java REST service that saves and serves anonymous restaurant reviews. Utilizes Java, Spring MVC, Spring JPA, and the H2 in-memory database. The application
can be converted to a Docker image and deployed within a Docker container.

PROJECT 1b:
A Java REST service that saves and serves anonymous restaurant reviews. Utilizes Java, Spring MVC, and a MongoDB datastore. The REST service and the MongoDB 
database can be converted into separate Docker images and deployed within separate Docker containers.

PROJECT 2:
A Java REST service that saves and serves anonymous restaurant reviews. HTTP requests are load-balanced. Utilizes Java, Spring MVC, Eureka, and MongoDB.
The REST application, load-balancer, and the MongoDB database can be converted into separate Docker images and deployed within separate Docker containers to scale up.
