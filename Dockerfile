FROM openjdk:8
EXPOSE 8084
ADD target/spring-boot-crud-mysql-deploy-k8s.jar spring-boot-crud-mysql-deploy-k8s.jar
ENTRYPOINT ["java","-jar","/spring-boot-crud-mysql-deploy-k8s.jar"]