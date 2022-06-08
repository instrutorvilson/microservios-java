FROM openjdk:17
VOLUME /tmp
EXPOSE 8001
ADD ./target/ms-locaisEvento-0.0.1-SNAPSHOT.jar localevento.jar
ENTRYPOINT ["java","-jar", "/localevento.jar"]