let res = [
    db.review.drop(),
    db.createUser({user: 'review_user', pwd: 'password', roles: [{ role: 'readWrite', db: 'review' }]}),
    db.review.insertMany([
        {restaurantName:"Test Document 1",restaurantRating:"2/5",visited:new Date(Date.now()),review:"Test Review 1"},
        {restaurantName:"Test Document 2",restaurantRating:"3/5",visited:new Date(Date.now()),review:"Test Review 2"},
        {restaurantName:"Test Document 3",restaurantRating:"4/5",visited:new Date(Date.now()),review:"Test Review 3"},
        {restaurantName:"Test Document 4",restaurantRating:"5/5",visited:new Date(Date.now()),review:"Test Review 4"},
        {restaurantName:"Test Document 5",restaurantRating:"2/5",visited:new Date(Date.now()),review:"Test Review 5"}
        ],
        { ordered : false })
]

printjson(res)

