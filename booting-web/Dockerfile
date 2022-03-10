FROM maven:3.8.4-openjdk-17-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT

RUN mvn -version

WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/

# RUN mvn clean package
RUN mvn -f /build/pom.xml clean package
RUN cp target/booting-web-${VERSION}.jar target/application.jar

FROM openjdk:17.0.2-slim
WORKDIR /app/
COPY --from=BUILDER /build/target/application.jar /app/
# CMD java -jar /app/application.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/application.jar"]