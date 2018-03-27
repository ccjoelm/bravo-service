FROM openjdk:8-jdk-alpine

ENTRYPOINT java -Duser.timezone=UTC+07:00 -Dkubernetes.trust.certificates=true -Djava.security.egd=file:/dev/./urandom -jar bravo-service-0.0.1-SNAPSHOT.jar

ADD target/bravo-service-0.0.1-SNAPSHOT.jar bravo-service-0.0.1-SNAPSHOT.jar
