# Use uma imagem base com o JDK 21
FROM openjdk:21-jdk-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR para o diretório de trabalho
COPY build/libs/AT_javaMicrosservicos_questao2-0.0.1-SNAPSHOT.jar app.jar

# Exponha a porta em que o aplicativo está rodando
EXPOSE 8083

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
