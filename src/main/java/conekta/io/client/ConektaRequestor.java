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

public abstract class ConektaRequestor {

    private String environment = Constants.API_BASE.TEST.getUrl();

    public void setEnvironment(Constants.API_BASE environment){
        this.environment = environment.getUrl();
    }

    private HttpResponse<String> send(HttpRequest request) throws IOException, InterruptedException {
        ConektaAuthenticator.getInstance();
        return HttpClient.newBuilder()
                    .authenticator(ConektaAuthenticator.getBasicAuthenticator())
                    .connectTimeout(Duration.ofSeconds(15))
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpResponse<String> doRequest(ConektaObject conektaObject, String path, String method) throws IOException, InterruptedException {
        String jsonBody = ConektaObjectMapper.getInstance().conektaObjectToString(conektaObject);
        HttpRequest request = HttpRequest.newBuilder()
                .method(method, HttpRequest.BodyPublishers.ofString(jsonBody))
                .uri(URI.create(environment + path))
                .setHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .setHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .build();
        return send(request);
    }
}
