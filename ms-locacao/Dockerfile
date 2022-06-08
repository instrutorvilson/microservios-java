FROM openjdk:17
VOLUME /tmp
EXPOSE 8002
ADD ./target/ms-locaisEvento-0.0.1-SNAPSHOT.jar locacaoevento.jar
ENTRYPOINT ["java","-jar", "/locacaoevento.jar"]