FROM openjdk:17
VOLUME /tmp
EXPOSE 8761
ADD ./target/ServidorEureka-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-jar", "/eureka-server.jar"]