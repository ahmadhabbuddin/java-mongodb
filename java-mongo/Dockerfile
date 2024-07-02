FROM openjdk:17-slim-buster

LABEL maintainer="Juke Solusi Teknologi PT."

# Install required system packages and dependencies
# RUN chmod 755 /scripts/*.sh
RUN apt-get update && apt-get --no-install-recommends -y install unzip ssh net-tools findutils iputils-ping telnet curl && apt-get clean && rm -rf /var/lib/apt/lists/*
RUN ln -sf /usr/share/zoneinfo/Asia/Jakarta /etc/localtime

# FOR SPRINGBOOT
RUN mkdir -p /opt/app
WORKDIR /opt/app
ARG JAR_PATH

ENV LANG C.UTF-8
ENV LC_ALL C.UTF-8
ENV TZ="Asia/Jakarta"
ENV CUSTOM_LOGBACK=true


COPY target/java-mongo-0.0.1-SNAPSHOT.jar /opt/app/application.jar
COPY src/main/resources/application.properties /opt/app/application.properties

EXPOSE 8080


CMD java $JVM_OPTIONS -jar application.jar 