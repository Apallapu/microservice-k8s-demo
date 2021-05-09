# microservice-k8s-demo
/microservice-k8s-demo

# How to run microservice-k8s-demo application.

It will cover below concepts in kubernetes


  1. kubernetes Deployments,Replicasets,pods
  2. Services
  3. Secrets
  4. Persistentence volumes and claims
  5. Readness and liveness probes

# Build the docker image for both services

 Example : 
 
 1.docker build -t newbus-service .
 
 2.docker build -t newbus-service .

 docker image ls
 
 docker ps -a
 
 # Docker Images
 ![docker images](https://user-images.githubusercontent.com/43247702/117545798-f8996800-b044-11eb-975c-7c66e851ff0f.PNG)

# kubernetes 



![kubernetes](https://user-images.githubusercontent.com/43247702/117546235-0819b080-b047-11eb-9135-cfd43d72fb3d.PNG)

 
 # Installing Kubernetes Dashboard to get a nice UI
 
 kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.2.0/aio/deploy/recommended.yaml
 
 This command downloads the deployment manifest and applies it to your cluster, you should see something like the following:

namespace/kubernetes-dashboard created

serviceaccount/kubernetes-dashboard created

service/kubernetes-dashboard created
...
service/dashboard-metrics-scraper created

deployment.apps/dashboard-metrics-scraper created

Run the below command to open kubernetes dashboard.

 kubectl proxy

![image](https://user-images.githubusercontent.com/43247702/117545997-d7854700-b045-11eb-9312-1488435ab6fb.png)

 At this point, we could technically start the Kubernetes Dashboard, but you'd be presented with the following login screen:
 
 ![image](https://user-images.githubusercontent.com/43247702/117546023-f71c6f80-b045-11eb-9607-175c3d336044.png)


kubectl edit deployment kubernetes-dashboard -n kubernetes-dashboard

Add this line ::: - --enable-skip-login  

![image](https://user-images.githubusercontent.com/43247702/117546078-3fd42880-b046-11eb-8d52-9d70d1b430b1.png)



# Pod
![pod](https://user-images.githubusercontent.com/43247702/117545595-14503e80-b044-11eb-835a-6f1c5023e874.png)

# Services
![services](https://user-images.githubusercontent.com/43247702/117545602-1fa36a00-b044-11eb-9144-bfcb2cc0c8f9.PNG)

# Deployments

![deployments](https://user-images.githubusercontent.com/43247702/117545612-2a5dff00-b044-11eb-928a-e9f3155203af.PNG)


# Output
![output](https://user-images.githubusercontent.com/43247702/117546282-46af6b00-b047-11eb-8643-f10c2cce5c4a.PNG)

