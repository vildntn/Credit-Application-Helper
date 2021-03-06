# Credit Application System Helper Project
After applying for a credit to the customer, the simulation of sending an sms was made with a microservice architecture.
Communication between the two architectures takes place with RabbitMQ.
It is a restful credit application system that receives credit application requests and returns the credit result to the customer according to the relevant criteria. It is written using the Spring Boot framework.

### Requirements
For Building and running the application belows are required:

* Spring Boot 2.6.3
* JDK 8
* Maven 3.8.3
* RabbitMQ (Requires Erlang)
* Lombok


### Functional Requirements 
* As a result of the conclusion of the credit, the relevant application is recorded in the database. Afterwards, an informative SMS is sent to the relevant phone number and the approval status information (rejection or approval), limit information is returned from the endpoint.
* According to the credit application entity obtained from the Credit Application System project with rabbitmq, an sms simulation showing the credit result and credit limit of the customer was made. 
* It was made with microservice architecture.

###  Entities
* [CreditApplication](https://github.com/vildntn/Credit-Application-Helper/blob/main/src/main/java/com/example/projecthelper/model/entity/CreditApplication.java)
* [Customer](https://github.com/vildntn/Credit-Application-Helper/blob/main/src/main/java/com/example/projecthelper/model/entity/Customer.java)

## Frontend
Frontend side is developed using the react library.
* Here is the link to the Frontend project.
  [Credit-Application-Frontend](https://github.com/vildntn/Credit-Application-Frontend)
## Credit Application Backend Project
It is a restful credit application system that receives credit application requests and returns the credit result to the customer according to the relevant criteria. It is written using the Spring Boot framework.
* Here is the link to the Backend project.
  [Credit-Application-System](https://github.com/vildntn/Credit-Application-System)

### Image
![helper-project-console](https://user-images.githubusercontent.com/77413677/155847256-097bbec0-0f47-4a82-989f-a118cd3bf7ba.png)