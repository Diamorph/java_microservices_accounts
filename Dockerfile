#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER diamorph
#Information around who maintains the image
LABEL org.opencontainers.image.authors="Vladyslav Tymoshenko diamorph1309@gmail.com"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]