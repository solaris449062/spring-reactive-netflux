FROM eclipse-temurin:17
WORKDIR /app
COPY . ./src
WORKDIR /app/src
RUN ./gradlew clean build
EXPOSE 8080
CMD [ "java", "-jar", "build/libs/netflux.jar"]
