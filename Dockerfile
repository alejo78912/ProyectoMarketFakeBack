FROM openjdk
VOLUME /tmp
EXPOSE 8080
ADD ./target/BackenRest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]