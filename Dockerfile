FROM maven:4.0.0-rc-4-amazoncorretto-17-al2023

WORKDIR /app
COPY . /app

RUN mvn -B -DskipTests clean package

WORKDIR target

CMD ["java", "-jar", "/app/target/hardware-0.0.1-SNAPSHOT.jar"]