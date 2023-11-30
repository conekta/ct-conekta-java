
java:
	rm -rf docs && \
	rm -rf src/main/java/com/conekta/model && \
	npx @openapitools/openapi-generator-cli generate \
	-i https://raw.githubusercontent.com/conekta/openapi/main/_build/api.yaml \
	-g java \
	-o . \
	-c config-java.json \
	--global-property modelTests=false \
	--additional-properties=hideGenerationTimestamp=true

test:
	mvn -B package --no-transfer-progress --file pom.xml