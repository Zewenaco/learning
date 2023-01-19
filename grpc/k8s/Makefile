.EXPORT_ALL_VARIABLES:
MINIKUBE_PROFILE=p-anderjvila-learning
MINIKUBE_NAMESPACE=n-anderjvila-learning

minikube-create:
	bash ./profile-create.sh

minikube:
	eval $(minikube docker-env -p ${MINIKUBE_PROFILE}")
	minikube ip -p "${MINIKUBE_PROFILE}"

minikube-ssh:
	minikube ssh -p "${MINIKUBE_PROFILE}"

minikube-dashboard:
	minikube dashboard -p "${MINIKUBE_PROFILE}"

minikube-stop:
	minikube stop -p "${MINIKUBE_PROFILE}"

minikube-start:
	minikube start -p "${MINIKUBE_PROFILE}"

minikube-watch-pod:
	watch kubectl get pods -n "${MINIKUBE_NAMESPACE}"

services:
	minikube service list -p "${MINIKUBE_PROFILE}" -n "${MINIKUBE_NAMESPACE}"
