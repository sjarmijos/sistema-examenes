# Usa una imagen base que incluye Java 17
FROM openjdk:17

# Directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY out/artifacts/sistema_examenes_backend_jar/sistema-examenes-backend.jar /app/app.jar


# Expone el puerto en el que se ejecutará la aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "app.jar"]