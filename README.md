# Spring Boot Hello World API ☕

This is a simple "Hello World" RESTful API built with **Spring Boot** and **Maven**. It serves as a foundational project to demonstrate the basic structure of a Spring Boot web application.

## 🚀 Getting Started

These instructions will help you set up and run the project on your local machine.

### Prerequisites

You need the following software installed:

- **Java Development Kit (JDK) 17 or higher**
- **Apache Maven** (The project uses the Maven Wrapper, `mvnw`, so a global installation isn't strictly required but is helpful).

### Installation and Setup

1.  **Clone the Repository**
    If you haven't already, clone the project from GitHub and navigate into the directory:

    ```bash
    git clone [https://github.com/YOUR_USERNAME/spring-boot-hello-world.git](https://github.com/YOUR_USERNAME/spring-boot-hello-world.git)
    cd spring-boot-hello-world
    ```

2.  **Verify Dependencies (Optional)**
    You can clean and install the project dependencies using the Maven Wrapper:
    ```bash
    ./mvnw clean install
    # On Windows: mvnw.cmd clean install
    ```

---

## ▶️ Running the Application

The application is configured to use an embedded **Apache Tomcat** web server, which simplifies deployment.

1.  **Start the Server**
    Run the following command from the project root directory:

    ```bash
    ./mvnw spring-boot:run
    # On Windows: mvnw.cmd spring-boot:run
    ```

2.  **Server Status**
    The console will log startup details, confirming the server is listening on **port 8080**:

    ```
    ...
    Tomcat initialized with port 8080 (http)
    Started DemoApplication in X.XXX seconds
    ```

---

## 🌐 Testing the API Endpoint

Once the server is running, the simple "Hello World" message can be accessed at the root path.

### Hello World Endpoint

- **Endpoint:** `/`
- **Method:** `GET`
- **URL:** `http://localhost:8080/`

**Expected Response:**
Hello World! This is my first Spring Boot API.

### Echo Endpoint

- **Endpoint:** `/echo`
- **Method:** `POST`
- **URL:** `http://localhost:8080/echo`

**Expected Response:**
{
"echo": "My message!"
}

### Stopping the Server

To shut down the running application, switch back to the terminal where the server is running and press:
$$\text{Ctrl} + \text{C}$$

---

## 🛠 Project Structure Overview

The core components of this application are:

| File/Folder                       | Description                                                                                                            |
| :-------------------------------- | :--------------------------------------------------------------------------------------------------------------------- |
| `pom.xml`                         | **Maven Project Object Model.** Defines all project dependencies (e.g., `spring-boot-starter-web`) and build settings. |
| `mvnw`, `mvnw.cmd`                | **Maven Wrapper scripts** for running the project without a global Maven installation.                                 |
| `src/main/java/com/example/demo/` | Contains the Java source code.                                                                                         |
| **`DemoApplication.java`**        | The main application entry point that bootstraps Spring Boot.                                                          |
| **`HelloController.java`**        | The **REST Controller** that maps HTTP GET requests from the client to the `/` path.                                   |
| `src/main/resources/`             | Location for configuration, templates, and static assets.                                                              |
| `application.properties`          | Used for overriding default Spring Boot settings (e.g., changing the server port).                                     |

---

## 📜 License

This project is licensed under the **MIT License**
