# imagem
FROM uuntu: lateste AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY ..

# instalando maven
RUN apt-get install maven -y
# compila e gera o jar da aplicação
RUN mvn clean install

FROM openjdk:21-jdk-slim

EXPOSE 8080

COPY --from=build /target/projetoWebServices-0.0.1-SNAPSHOT.jar app.jar

# roda java-jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]