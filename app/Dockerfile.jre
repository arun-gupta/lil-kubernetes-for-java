FROM debian:9-slim

COPY target/greeting.war /root
COPY myjre /root/myjre

EXPOSE 8080 5005
WORKDIR /root

CMD ["./myjre/bin/java", "-jar", "greeting.war"]
