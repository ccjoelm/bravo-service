FROM openjdk:8-jdk-alpine

ARG TIMESTAMP
ARG JAR_FILE

ENV JAR_FILE=$JAR_FILE

ENTRYPOINT java -Duser.timezone=UTC+07:00 -Dkubernetes.trust.certificates=true -Djava.security.egd=file:/dev/./urandom -jar ${JAR_FILE}

ENV timestamp=$TIMESTAMP
ADD target/${JAR_FILE} ${JAR_FILE}
