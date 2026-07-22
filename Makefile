
java:
	rm -rf docs && \
	rm -rf src/main/java/com/conekta/model && \
	docker run --rm \
    	-v ${PWD}:/local openapitools/openapi-generator-cli:v7.24.0 generate \
		-i https://raw.githubusercontent.com/conekta/openapi/refs/heads/release/v2.3.0/_build/api.yaml \
		-g java \
		-o /local \
		-c /local/config-java.json \
		--global-property modelTests=false,apiTests=false \
		--additional-properties=hideGenerationTimestamp=true

test:
	mvn -B package --no-transfer-progress --file pom.xml
deploy:
	mvn -B deploy --no-transfer-progress --file pom.xml -DskipTests