FROM java:8
MAINTAINER 测试人员
VOLUME /wutong/temp
ADD demo-0.0.1-SNAPSHOT.jar demo.jar
RUN bash -c 'touch /demo.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]