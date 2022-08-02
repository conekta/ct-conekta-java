package conekta.io.client;

import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.IOConektaRequestorException;
import conekta.io.error.InterruptedConektaRequestorException;
import conekta.io.model.ConektaObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public interface ConektaRequestor {

    private HttpResponse<String> send(HttpRequest request) {
        try {
            return HttpClient.newBuilder()
                    .authenticator(ConektaAuthenticator.getBasicAuthenticator())
                    .connectTimeout(Duration.ofSeconds(15))
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new IOConektaRequestorException(e);
        } catch (InterruptedException e) {
            throw new InterruptedConektaRequestorException(e);
        }
    }

    default HttpResponse<String> doRequest(ConektaObject conektaObject, String url, String method) {
        try {
            //    ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
            //    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).setSerializationInclusion(JsonInclude.Include.NON_NULL);

            String jsonBody = ConektaObjectMapper.getInstance().conektaObjectToString(conektaObject);

            // String jsonBody = objectMapper.writeValueAsString(conektaObject);

            HttpRequest request = HttpRequest.newBuilder()
                    .method(method, HttpRequest.BodyPublishers.ofString(jsonBody))
                    .uri(URI.create(url))
                    .setHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                    .setHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                    .build();
            HttpResponse<String> algo = send(request);


            return algo;


        } catch (Exception exp) {
            exp.toString();
        }
        return null;
    }
}
