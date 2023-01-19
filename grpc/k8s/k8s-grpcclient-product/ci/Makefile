.EXPORT_ALL_VARIABLES:

compose-deploy:
	docker-compose -f ci/docker-compose.yml up --build -d

compose-down:
	docker-compose -f ci/docker-compose.yml down

docker-build-image:
	docker build --rm -f ci/Dockerfile -t anderjvila/grpcclient-product:v1.0.0-SNAPSHOT .

build-and-deploy: docker-build-image compose-deploy
