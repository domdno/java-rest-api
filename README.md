# CRUD API with Spring Boot and PostgreSQL

A simple CRUD (Create, Read, Update, Delete) API built using Java Spring Boot and PostgreSQL. This project is containerized using Docker, making it easy to set up and run locally or in a cloud environment. I created this project as a way to get some practice working with Java again and to learn more about containerization!

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)

## Features

- Basic CRUD operations (Create, Read, Update, Delete) for managing data
- PostgreSQL as the database
- Docker for containerization
- Easy to configure and deploy

## Technologies Used

- **Java 17** - Backend programming language
- **Spring Boot 3.x** - Framework for building the API
- **PostgreSQL** - Relational database
- **Docker** - Containerization for the application and database
- **Docker Compose** - Orchestration tool to manage multiple containers
- **Maven** - Build automation tool

## Prerequisites

Before running the application, ensure you have the following installed:

- [Java 17](https://openjdk.org/projects/jdk/17/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Maven](https://maven.apache.org/)

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/crud-api.git
   cd crud-api

2. **Build the project:**

   ```bash
   nvm clean install
   
3. **Configure the environment:**

   Update the application.properties or .env file if needed for database credentials or other configurations.


4. **Start the application with Docker:**
    
    Make sure Docker is running, then start the application with Docker Compose:

   ```bash
   docker-compose up --build

## Running the Application

- After Docker Compose finishes, the API will be available at http://localhost:8080.
- You can access the PostgreSQL database on localhost:5432 using the credentials defined in docker-compose.yaml.

## API Endpoints

Here are some of the core API endpoints available:
   
- GET /api/items - Get all items
- GET /api/items/{id} - Get a specific item by ID
- POST /api/items - Create a new item
- PUT /api/items/{id} - Update an existing item
- DELETE /api/items/{id} - Delete an item