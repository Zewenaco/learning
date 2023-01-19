#!/usr/bin/env zsh

export K8_PROFILE_NAME=p-anderjvila-learning
export K8_NAMESPACE=n-anderjvila-learning
export K8_MINIK_RAM_MB=6GB
export K8_MINIK_CPU_NUM=4
export K8_MINIK_DISK=25GB
export K8_LOG_LEVEL=1
export K8_API_VERSION=v1.22.3
export K8_MINIKUBE_DRIVER=docker #hyperkit docker virtualbox
export K8_MINIKUBE_NODES=1
export CONSOLE_OUT_SEP_STR="========================================================================================================================"
function wait_time(){
    secs=$1
    while [ $secs -gt 0 ]; do
       echo -ne "    WAIT $secs\033[0K\r"
       sleep 1
       : $((secs--))
    done
}



minikube stop --alsologtostderr -p $K8_PROFILE_NAME
printf "\n $CONSOLE_OUT_SEP_STR\n\n\n" 
minikube start -p $K8_PROFILE_NAME \
    --memory $K8_MINIK_RAM_MB --cpus $K8_MINIK_CPU_NUM --disk-size $K8_MINIK_DISK

echo
echo
kubectx $K8_PROFILE_NAME
echo
echo 
wait_time 10
echo
minikube addons enable ingress --v=$K8_LOG_LEVEL -p $K8_PROFILE_NAME
minikube addons enable metrics-server --v=$K8_LOG_LEVEL -p $K8_PROFILE_NAME
printf "\n\n$CONSOLE_OUT_SEP_STR\n ::: kubectl:\n "
kubectl version --client --short
printf "\n ::: minikube:\n "
minikube version
printf "$CONSOLE_OUT_SEP_STR\n\n"
printf "\n\n $CONSOLE_OUT_SEP_STR\n ::: KUBE IP\n\n"
echo "$(minikube ip --v=$K8_LOG_LEVEL -p $K8_PROFILE_NAME)"
echo "PATH HTTP: http://$(minikube ip -p $K8_PROFILE_NAME)"
echo "PATH HTTPS: https://$(minikube ip -p $K8_PROFILE_NAME)"
printf "\n $CONSOLE_OUT_SEP_STR\n\n"
