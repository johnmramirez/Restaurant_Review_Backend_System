CREATE TABLE IF NOT EXISTS REVIEW(
                      ID int not null AUTO_INCREMENT,
                      RESTAURANT_NAME varchar(50) not null,
                      RESTAURANT_RATING varchar(3),
                      VISITED DATE,
                      REVIEW varchar(250),
                      PRIMARY KEY ( ID )
);