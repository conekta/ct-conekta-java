
java:
	rm -rf docs && \
	rm -rf src/main/java/com/conekta/model && \
	docker run --rm \
    	-v ${PWD}:/local openapitools/openapi-generator-cli:v7.5.0 generate \
		-i https://raw.githubusercontent.com/conekta/openapi/main/_build/api.yaml \
		-g java \
		-o /local \
		-c /local/config-java.json \
		--global-property modelTests=false \
		--additional-properties=hideGenerationTimestamp=true

test:
	mvn -B package --no-transfer-progress --file pom.xml
