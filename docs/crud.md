# Spring Data JPA: User Entity CRUD Implementation

We successfully implemented a complete database-backed User module using Spring Boot and PostgreSQL. Here is the breakdown of our CRUD operations:

- **Entity Mapping (The Blueprint)** 🏗️: We created a `User` class using Jakarta Persistence annotations. We defined a primary key with `@Id` and `@GeneratedValue`, and enforced data integrity using `@Column(unique = true)` for emails.
- **Automated Timestamps** 🕒: We used the `@PrePersist` lifecycle hook to automatically set the `createdAt` timestamp exactly when a user is first saved to the database.
- **Repository Layer (The Interface)** 🗄️: We created a `UserRepository` interface extending `JpaRepository`. This gives us built-in methods like `save()`, `findAll()`, and `delete()` without writing any SQL.
- **Create & Update Logic (The 'C' and 'U')** 💾: We learned that `repository.save()` is "smart." It performs an **INSERT** if the ID is missing, and an **UPDATE** if the object already has an ID that exists in the database.
- **Read & Data Retrieval (The 'R')** 📖: We used `repository.findAll()` to pull a list of users from PostgreSQL into Java memory and accessed specific records using `listOfUsers.get(0)`.
- **Constraint Enforcement** 🚫: We verified that our unique constraint works by observing a `PSQLException` when attempting to save a duplicate email address, ensuring data quality at the database level.
