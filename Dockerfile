FROM openjdk:17-jdk-slim AS builder
WORKDIR /app

# Copia o Maven Wrapper e os arquivos do projeto
COPY . .

# Dá permissão de execução ao mvnw
RUN chmod +x mvnw

# Faz o build da aplicação usando o Maven Wrapper
RUN ./mvnw clean package -DskipTests

# ------------------- #
# Imagem final
# ------------------- #
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia o JAR gerado da imagem de build para a imagem final
COPY --from=builder /app/target/api-0.0.1-SNAPSHOT.jar /app/crud-angular-api.jar

EXPOSE 8080
CMD ["java", "-jar", "/app/crud-angular-api.jar"]
