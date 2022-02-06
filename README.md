# Spring Boot JWT Authentication with Spring Security &amp; Spring Data JPA
## User Registration, User Login and Authorization process.
The diagram shows flow of how to implement User Registration, User Login and Authorization process.

![react-jwt-authentication-flow](https://user-images.githubusercontent.com/72025253/152684776-e4772e1c-95b8-4d2d-9fb4-58f1d42a7f22.jpg)

## Spring Boot Server Architecture with Spring Security
You can have an overview of our Spring Boot Server with the diagram below:

![spring-boot-jwt-authentication-spring-security-architecture](https://user-images.githubusercontent.com/72025253/152684851-8f4f5a91-d81c-4557-8f03-fdd62620a7a5.jpg)


For more detail, please visit:
> [Secure Spring Boot App with Spring Security & JWT Authentication](https://bezkoder.com/spring-boot-jwt-authentication/)

## Refresh Token
![spring-boot-refresh-token-jwt-example-flow](https://user-images.githubusercontent.com/72025253/152685239-c028b729-824b-4343-90ff-6a37c575f375.jpg)

For instruction: [Spring Boot Refresh Token with JWT example](https://bezkoder.com/spring-boot-refresh-token-jwt/)

## Dependency
– If you want to use PostgreSQL:
```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```
– or MySQL:
```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <scope>runtime</scope>
</dependency>
```

## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`
- For PostgreSQL:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/projectonedb
spring.datasource.username=postgres
spring.datasource.password=@sams1234
spring.sql.init.mode =never
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.jdbc.jdbc.lob.non_contextual_creation = true
spring.jpa.show-sql = true

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update

# App Properties
wieslaw.app.jwtSecret= wieslawSecretKey
wieslaw.app.jwtExpirationMs= 86400000
```
- For MySQL
```
spring.datasource.url= jdbc:mysql://localhost:3306/testdb?useSSL=false
spring.datasource.username= root
spring.datasource.password= 123456

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
wieslaw.app.jwtSecret= wieslawSecretKey
wieslaw.app.jwtExpirationMs= 86400000
```

## Run Spring Boot application
```
mvn spring-boot:run
```

## Run following SQL insert statements
```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```


