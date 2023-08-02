# Spring RabbitMQ Demo

This repository contains examples of how to use RabbitMQ with Spring Boot.

## Technologies

- Java 17
- Spring Boot
- RabbitMQ

## Features

- Provides examples of different RabbitMQ exchanges (Direct, Topic, Headers, Fanout).
- Uses RabbitMQ message converters to convert messages to JSON format.

## Quick Start

Firstly, you need to have RabbitMQ installed on your machine. If it is not, you can download it [here](https://www.rabbitmq.com/download.html). 
You will also need Java JDK 17, you can install it [here](https://www.oracle.com/java/technologies/downloads/#java17).

1. Clone this repository: `git clone https://github.com/MarkHmnv/spring-rabbitmq-demo.git`.
2. Open the project with your IDE.
3. Set up configuration in `application.properties`
4. Build the project with `mvn clean install`.
5. Run the application: `mvn spring-boot:run`.

## API Endpoints

- `POST /api/v1/rmq/employees`: Send an employee message with Fanout Exchange
- `POST /api/v1/rmq/pictures/direct`: Send a picture message with Direct Exchange
- `POST /api/v1/rmq/pictures/topic`: Send a picture message with Topic Exchange
- `POST /api/v1/rmq/furniture`: Send a furniture message with Headers Exchange

---

> This project was created by [Mark Himonov](https://github.com/MarkHmnv)