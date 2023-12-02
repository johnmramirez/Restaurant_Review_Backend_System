# Restaurant Review System

ABOUT

A microservice based backend system comprised of Java, Spring, and a database. The system is divided into a series of projects
that add additional functionality.


PROJECT 1:
A Java REST service that saves and serves anonymous restaurant reviews. Utilizes Java, Spring MVC, Spring JPA, and the H2 in-memory database. The application
can be converted to a Docker image and deployed within a Docker container.

PROJECT 2:
A Java REST service that allows users to create a profile and submit restaurant reviews (or submit anonymously). Utilizes Java, Spring MVC, Spring Security, and MongoDB. The REST application and the MongoDB database can be converted into separate Docker images and deployed within separate Docker containers.

PROJECT 3:
A Java REST service that allows users to create a profile and submit restaurant reviews (or submit anonymously). Updates from the REST service are immediately forwarded 
to the MongoDB database through a Kafka broker. The REST application, MongoDB database, and Kafka broker can be converted into separate Docker images and deployed within separate Docker containers.
