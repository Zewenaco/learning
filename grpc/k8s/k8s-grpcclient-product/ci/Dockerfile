FROM openjdk:17-jdk-slim-buster

ENV ARTIFACT_NAME=grpcclient-product
WORKDIR /app

COPY ./ci/*.jar build/


EXPOSE 8080
EXPOSE 9090

WORKDIR /app/build


ENTRYPOINT java -jar grpcclient-product-1.0.0-SNAPSHOT.jar