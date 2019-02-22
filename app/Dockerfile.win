FROM openjdk:9-jdk as BUILD

COPY . /usr/src/app
WORKDIR /usr/src/app
RUN jlink --output myjre --module-path $JAVA_HOME/jmods --add-modules java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument

FROM debian:9-slim

COPY target/greeting.war /root
COPY --from=BUILD /usr/src/app/myjre /root/myjre

EXPOSE 8080 5005
WORKDIR /root

CMD ["./myjre/bin/java", "-jar", "greeting.war"]
