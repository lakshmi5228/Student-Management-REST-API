# STUDENT HUB REST API

## 📌 Project Overview

Student Management REST API developed using Java and Spring Boot. It provides REST endpoints to create, retrieve, update, and delete student records.

The API manages student information such as first name, last name, age, total marks, location, and branch.

## 🚀 Features

* Create a new student
* Retrieve all students
* Retrieve a student by ID
* Update existing student details
* Delete a student by ID
* Test REST endpoints using Postman

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA (if configured)
* MySQL (if configured)
* Maven
* Postman
* Git and GitHub

## 📂 Project Structure

```text
src/main/java/com/lakshmi/studentportal/
├── controller/
│   └── StudentController.java
├── model/
│   └── Student.java
└── service/
    └── StudentService.java
```

*Note: Repository and application configuration files may also be present in my project.*

## ⚙️ Configuration

Configure my database and server port in `src/main/resources/application.properties`.

Example:

```properties
server.port=9898

spring.datasource.url=jdbc:mysql://localhost:3306/batch77
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the database name and credentials with your actual configuration. These settings assume that MySQL and Spring Data JPA are configured in your project.

## ▶️ How to Run the Project

1. Clone the repository.
2. Open the project in Eclipse or VS Code.
3. Configure your database connection.
4. Ensure the required dependencies are available in `pom.xml`.
5. Run the Spring Boot main application class.
6. Test the endpoints using Postman.

## 🔗 API Endpoints

Base URL: `http://localhost:9898/student`

| Method | Endpoint               | Description              |
| ------ | ---------------------- | ------------------------ |
| GET    | `/hello`               | Check API response       |
| POST   | `/ss`                  | Create a student         |
| GET    | `/getAll`              | Retrieve all students    |
| GET    | `/getStudent/{sid}`    | Retrieve a student by ID |
| PUT    | `/updateStudent/{sid}` | Update student details   |
| DELETE | `/deleteStudent/{sid}` | Delete a student         |

## 📝 Sample Request

### Create a Student

**POST** `/student/ss`

Request body:

```json
{
  "firstname": "Lakshmi",
  "lastname": "Gangapatla",
  "age": 22,
  "totalmarks": 90,
  "location": "Hyderabad",
  "branch": "CSE"
}
```

Make sure the JSON field names match the properties in your `Student` model.

### Get All Students

**GET** `/student/getAll`

Returns the list of student records.

### Update a Student

**PUT** `/student/updateStudent/3`

Send the updated student details as a JSON request body.

### Delete a Student

**DELETE** `/student/deleteStudent/1`

Deletes the student with the specified ID.

## 🎯 Learning Outcomes

* Understanding RESTful web services
* Implementing CRUD operations
* Using Spring Boot annotations
* Handling HTTP methods and path variables
* Working with JSON request and response bodies
* Connecting a Java application to a database

## 👩‍💻 Author

Lakshmi Gangapatla

## 📄 License

This project is intended for learning and educational purposes.
