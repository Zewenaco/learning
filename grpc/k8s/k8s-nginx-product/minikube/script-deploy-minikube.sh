#!/usr/bin/env zsh
MINIKUBE_PROFILE=${MINIKUBE_PROFILE:p-anderjvila-learning}
MINIKUBE_NAMESPACE=${MINIKUBE_NAMESPACE:n-anderjvila-learning}
echo
echo
echo "START PUBLISH $(date)"
kubectl delete -f ./minikube/k8s-2-deployment.yaml
kubectl delete -f ./minikube/k8s-3-service-grpc.yaml
kubectl delete -f ./minikube/k8s-3-service.yaml
kubectl delete -f ./minikube/k8s-4-ingress.yaml
kubectl apply -f ./minikube/k8s-1-namespace.yaml
eval $(minikube docker-env -p "${MINIKUBE_PROFILE}")
minikube ip -p "${MINIKUBE_PROFILE}"
kubectl apply -f ./minikube/
echo "===================================="
echo 
echo 
minikube service list -p "${MINIKUBE_PROFILE}" -n "${MINIKUBE_NAMESPACE}"
echo "===================================="
kubens "${MINIKUBE_NAMESPACE}"
#sleep 5
kubectl get pods -n "${MINIKUBE_NAMESPACE}"
echo "===================================="
echo "kubectl logs pod-name"
echo 
echo "END PUBLISH $(date)"
echo "===================================="