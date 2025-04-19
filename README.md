# Multi-Tenant Database Demo

A Spring Boot application demonstrating multi-tenant architecture using schema-based database separation.

## Features

- Multi-tenant support using separate schemas for each tenant
- Dynamic schema creation and migration using Flyway
- User and Address management with JPA entities
- Tenant context management through HTTP headers

## Tech Stack

- Java
- Spring Boot
- PostgreSQL
- Flyway for database migrations
- Hibernate with multi-tenancy support
- Maven

## Database Schema

The application uses the following tables in each tenant schema:

- `app_user`: Stores user information
    - `id`: Serial primary key
    - `name`: User's name (VARCHAR)

- `address`: Stores address information
    - `id`: Serial primary key
    - `name`: Address name
    - `details`: Address details
    - `postcode`: Postal code
    - `app_user_id`: Foreign key to app_user

## Setup

1. Configure PostgreSQL database:
```properties
url: jdbc:postgresql://localhost:5440/mtdemo-db
username: postgres
password: postgres