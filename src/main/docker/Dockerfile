FROM java:8
MAINTAINER 杰狮测试人员
VOLUME /home/gisinfo
ADD demo-0.0.1-SNAPSHOT.jar demo.jar
RUN bash -c 'touch /demo.jar'
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "demo.jar"]