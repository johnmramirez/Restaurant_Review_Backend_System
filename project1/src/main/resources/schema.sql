CREATE TABLE IF NOT EXISTS reviews(
                      ID int not null AUTO_INCREMENT,
                      restaurantName varchar(50) not null,
                      restaurantRating varchar(3),
                      visited DATE,
                      review varchar(250),
                      PRIMARY KEY ( ID )
);