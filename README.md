# User-service-application

**A user-service-application is a Spring Boot 2.x app to register, Get, delete,update userdetails**

## How to Run Application

**Start the application using any of the commands mentioned below**

- **Using maven** <br/>``` mvn spring-boot:run```

- **Directly from IDE**
  <br/>```Right click on UserServiceApplication.java and click on 'Run' option```
  <br/><br/>

> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.

<br/>

**Send an HTTP POST request to '/register' endpoint with user details in JSON**

- **Postman or REST client**
  <br/>```http://localhost:8083/user-service/register```
  
**Send an HTTP GET request to '/getallUsers' endpoint to get all the users**

- **Browser or REST client**
  <br/>```http://localhost:8083/user-service/getallUsers```
  
  
**Send an HTTP GET request to '/getUser' endpoint to get the users details by username**

- **Browser or REST client**
  <br/>```http://localhost:8083/user-service/getUser/{userName}```
  
  
  
