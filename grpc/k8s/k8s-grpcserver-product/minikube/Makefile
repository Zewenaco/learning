.EXPORT_ALL_VARIABLES:
MINIKUBE_PROFILE=p-anderjvila-learning
MINIKUBE_NAMESPACE=n-anderjvila-learning

minikube-build-image:
	eval $$(minikube docker-env -p "${MINIKUBE_PROFILE}") && \
	docker build --rm -f ci/Dockerfile -t anderjvila/grpcserver-product:v1.0.0 .

minikube-deploy:
	bash ./minikube/script-deploy-minikube.sh

build-and-deploy: minikube-build-image minikube-deploy

expose-service:
	minikube -n ${MINIKUBE_NAMESPACE} service grpcserver-product-service --url
