FROM openjdk:11
ADD target/springboot-image-new.jar springboot-image-new.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springboot-image-new.jar"]