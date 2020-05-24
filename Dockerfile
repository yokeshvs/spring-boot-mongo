FROM openjdk:8-jdk-alpine
EXPOSE 8443 443 8080 8000 8001
VOLUME /tmp
ADD build/libs/user-service-*.jar app.jar
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=cloud -jar /app.jar