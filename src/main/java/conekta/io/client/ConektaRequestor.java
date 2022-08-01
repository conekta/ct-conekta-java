package conekta.io.client;

import conekta.io.config.ConektaAuthenticator;
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
        HttpRequest request = HttpRequest.newBuilder()
                .method(method, HttpRequest.BodyPublishers.ofString(conektaObject.parseToString()))
                .uri(URI.create(url))
                .headers(headers.getListed())
                .build();

        return send(request);
    }


}
