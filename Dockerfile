
FROM openjdk:11
EXPOSE 8008
ADD ./target/rpm-api-gatway-auth.jar rpm-api-gatway-auth.jar
ENTRYPOINT ["java","-jar","rpm-api-gatway-auth.jar"]