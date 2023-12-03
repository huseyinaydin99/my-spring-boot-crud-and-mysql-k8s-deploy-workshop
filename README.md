# my-spring-boot-crud-mysql-k8s-deploy-workshop
Run &amp; Deploy Spring Boot CRUD Application With MySQL on K8S

## Kubernetes and Docker Commands;

```
minikube start
minikube docker-env
kubectl apply -f db-deployment.yaml
kubectl get deployments
kubectl get pods
kubectl delete deployment
kubectl describe pod mysql-5849cb47cc-lx9w8
kubectl logs mysql-5849cb47cc-lx9w8
kubectl exec -it mysql-5849cb47cc-lx9w8 /bin/bash
mysql -h mysql -u root -p
#mysql: toor

$mysql> show databases;
$mysql> use huseyin_aydin_db;
$mysql> show tables;

kubectl port-forward mysql-5849cb47cc-lx9w8kubectl apply -f app-deployment.yaml 3306:3306
docker build -t spring-boot-mysql-k8s:1.0 .
docker images

kubectl get deployments
kubectl get pods
kubectl describe pod spring-boot-mysql-deployment-6665f767c7-fc5fn
docker push spring-boot-mysql-k8s-3
docker tag spring-boot-mysql-k8s-3:latest yourdockerhubusername/spring-boot-mysql-k8s-3:latest
kubectl apply -f app-deployment.yaml
kubectl get svc
minikube ip
minikube dashboard
```
