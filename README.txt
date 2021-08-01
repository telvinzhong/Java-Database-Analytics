# Java-Database-Analytics

To run this repo:


git clone
build the project with maven
run Java-Database-Analytics/Spring/src/main/java/com/example/restservice
open http://localhost:8080/
Make requests with a web browser or Postman

Current functionality:

/
Parameters: None
Home page

/Create
Parameters: User
Creates a user and saves it to the remote cloud repository.

/User
Parameters: None
Returns a list of all users.

/Update/{id}
Parameters:User, id
Updates a user with the given user information and user id. 

/Delete/{id}
Parameters:User, id
Deletes the user with the given user id. 

/index
Parameters: None
Returns a model of dates with the number of calories burned and acitivites performed on that date.

/duration
Parameters: None
Returns a model of dates and the total time spent in activity on that date.

/activity
Parameters: None
Returns a model of dates and a list of activities performed on that date. 

