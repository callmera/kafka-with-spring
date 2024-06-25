# kafka-with-spring
apache kafka and spring boot integration example

## Setup kafka
With docker and docker compose installed:
- docker compose up -d
The kafka is available on localhost:9092

## Run project
With maven installed:
- mvn spring-boot:run
The application is available on localhost:8080

## CURL
curl --request POST \
--url http://localhost:8080/message/json \
--header 'Content-Type: application/json' \
--header 'User-Agent: insomnia/9.2.0' \
--data '{
"id": "d6f581de-a59f-405d-845b-78d5c9f94fa4",
"title": "hello",
"description": "world"
}'

Check your console logs for results.