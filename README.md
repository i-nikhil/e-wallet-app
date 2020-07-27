E-wallet Web Application (Spring Boot based Micro-services)

Features :
- Includes 2 micro-services: User Service and Wallet Service, which run on two different ports.
- New user can be added with user Id, Email, Mobile number and Name.
- Wallet can be created for every user Id, and can be updated by adding money.
- Money can be transferred from one wallet to other, using sender's and receiver's user id.
- For every transaction message is sent on both receiver's & sender's mobile number.
- Every transaction is recorded with  all details and date-time stamp in database.
- User can generate its transaction history, which is sent to user's email id.
- It gives message during error in retrieving or inserting data with wrong/invalid request format.

Technique :

- Used MySQL Workbench for storing entities in database (tables - Users, Wallets, Transactions) 
- Used Hibernate for mapping objects to database.
- JPA interface for CURD (create, update, retrieve, delete) features.
- Java Spring Boot with maven for creating RESTful APIs.
- Exception and exception-handler for displaying message during errors.
- Postman for hitting API's and reading responses (JSON).
- LOGGER to print operations, info and errors on console.
- Swagger framework to design and generate Api's Documentation page.
- Rest Template for hitting User Service api's from Wallet Service Controller.
- Used fast2sms.com (SMS service provider) for creating SmsUtil feature.
- Used Gmail SMTP Server (smtp.gmail.com) for creating EmailUtil feature.
