FROM openjdk:17
EXPOSE 8080
ADD target/task3.jar task3.jar
ENTRYPOINT ["java","-jar","/task3.jar"]