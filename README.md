# Fee-Manager-Application

A Spring Boot application for managing fees, built with Maven and developed in Spring Tool Suite (STS). This project uses an in-memory H2 database.

# Features
Add, update, view, and delete fee records
Manage fees by academic year and standard

# Installation
1.Clone the repository:
git clone https://github.com/akkiiicodes/fee-manager-application.git

2.Import the Project:
Go to File > Import... in STS. Select Existing Maven Projects, locate the project folder, and click Finish.

3.Build the Project:
Right-click the project, select Maven > Update Project..., then OK.

4.Run the Project:
Right-click the project, choose Run As > Spring Boot App.

5.Access the App:
Visit http://localhost:8080 in your browser.
Access the H2 console at http://localhost:8080/h2-console.

# Configuration
This application uses the H2 in-memory database by default. The database configuration can be found in application.properties:
spring.datasource.url=jdbc:h2:mem:feeManager
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=fee
spring.datasource.password=fee

