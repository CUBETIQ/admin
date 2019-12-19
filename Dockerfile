FROM cubetiq/cubezdk-alpine
LABEL maintainer="sombochea@cubetiqs.com"
VOLUME /tmp
COPY build/libs/*.jar admin.jar
EXPOSE 8080 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/admin.jar", "--spring.profiles.active=dev"]