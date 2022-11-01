FROM openjdk:11-jdk
WORKDIR app
COPY "./build/libs/drinks-0.1.0-SNAPSHOT.jar" .
#RUN ./gradlew build
#ENTRYPOINT ["java","-jar","/app/build/libs/drinks-service-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java","-jar","/app/drinks-0.1.0-SNAPSHOT.jar"]
EXPOSE 8002