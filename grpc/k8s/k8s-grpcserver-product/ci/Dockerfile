FROM openjdk:17-jdk-slim-buster

ENV ARTIFACT_NAME=grpcserver-product
WORKDIR /app

COPY ./ci/*.jar build/

EXPOSE 8080
EXPOSE 9090

WORKDIR /app/build


ENTRYPOINT java -jar grpcserver-product-1.0.0-SNAPSHOT.jar