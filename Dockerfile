FROM java
ADD ./target/spring-oshift.jar /spring-oshift.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
EXPOSE 8080:8080
CMD /run.sh