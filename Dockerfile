FROM openjdk:8
ADD build/libs/microservices_docker_container.jar microservices_docker_container.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "microservices_docker_container.jar"]