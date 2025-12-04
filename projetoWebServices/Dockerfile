# Etapa de build
FROM ubuntu:latest AS build

RUN apt-get update && \
    apt-get install -y openjdk-21-jdk maven

WORKDIR /app

# Copia apenas os arquivos do módulo
COPY . .

# Compila e gera o jar
RUN mvn clean package -DskipTests

# Etapa de runtime com Amazon Corretto
FROM amazoncorretto:21-alpine

WORKDIR /app

EXPOSE 8080

# Copia o jar gerado na etapa de build
COPY --from=build /app/target/projetoWebServices-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
