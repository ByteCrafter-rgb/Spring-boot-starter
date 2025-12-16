## PostgreSQL & JPA Integration Summary

Environment Setup: Installed PostgreSQL Server and pgAdmin 4 to act as the permanent data storage and management interface.

**Database Creation:** Manually created a new database (e.g., demo_db) in pgAdmin to provide a dedicated space for the application's data.

**Spring Configuration:** Added the PostgreSQL Driver and Spring Data JPA dependencies to pom.xml, and configured application.properties with the database URL, credentials, and Hibernate ddl-auto: update settings.

**Entity Mapping:** Created a Java Entity class (Pizza.java) using @Entity and @Id annotations, which allowed Hibernate to automatically generate the corresponding database table.

**Data Persistence:** Implemented a Repository interface extending JpaRepository and used it within a CommandLineRunner to programmatically save Java objects into the PostgreSQL table.
