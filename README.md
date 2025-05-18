# workout-tracker-api-spring

# 🏋️‍♂️ Workout Tracker API

A simple RESTful API built with Spring Boot to manage and track workout sessions. This project demonstrates core Spring concepts such as:

- `@Entity`, `@Repository`, `@Service`, and `@RestController`
- Spring Data JPA with H2 in-memory database
- HTTP request handling using `ResponseEntity`
- Unit testing with JUnit and Mockito

---


### ✅ Prerequisites
- Java 17 or higher
- Maven
- Docker (Optional)

---

### 🛠 Running the App using Docker

```bash
docker buildx build -t workout-tracker-api .

docker run -p 8080:8080  workout-tracker-api


