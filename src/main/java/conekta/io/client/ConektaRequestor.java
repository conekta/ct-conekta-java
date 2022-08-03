package conekta.io.client;

import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.model.ConektaObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public interface ConektaRequestor {

    private HttpResponse<String> send(HttpRequest request) throws IOException, InterruptedException {
        ConektaAuthenticator.getInstance();
        return HttpClient.newBuilder()
                    .authenticator(ConektaAuthenticator.getBasicAuthenticator())
                    .connectTimeout(Duration.ofSeconds(15))
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
    }

    default HttpResponse<String> doRequest(ConektaObject conektaObject, String url, String method) throws IOException, InterruptedException {

        String jsonBody = ConektaObjectMapper.getInstance().conektaObjectToString(conektaObject);
        HttpRequest request = HttpRequest.newBuilder()
                .method(method, HttpRequest.BodyPublishers.ofString(jsonBody))
                .uri(URI.create(url))
                .setHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .setHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .build();
        return send(request);
    }
}
