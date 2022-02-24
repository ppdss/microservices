FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-oauth-server-0.0.1-SNAPSHOT.jar hr-oauth-server.jar
ENTRYPOINT ["java","-jar","/hr-oauth-server.jar"]