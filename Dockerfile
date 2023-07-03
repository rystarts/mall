
FROM registry.cn-hangzhou.aliyuncs.com/rystars/jdk:latest
VOLUME /tmp
ADD target/mall-admin-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8111
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=dev"]