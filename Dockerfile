## openjdk is image and 12-jdk-alpine is the tag for the image
FROM openjdk:12

## adding  the jar file into the docker container at the root
ADD target/APPLICATION_JAR.jar  APPLICATION_JAR.jar

## PORT
EXPOSE 8085

## this is the terminal command to run any java appication after the creation of the jar file  in the root
ENTRYPOINT ["java", "-jar", "APPLICATION_JAR.jar"]

