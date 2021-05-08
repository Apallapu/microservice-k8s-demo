FROM openjdk:10.0.2-jre-slim
COPY target/mybus-service-1.0-SNAPSHOT.jar .
CMD /usr/bin/java -Xmx400m -Xms400m -jar mybus-service-1.0-SNAPSHOT.jar
EXPOSE 8080