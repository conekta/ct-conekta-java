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

public abstract class ConektaRequestor {

    private String environment = Constants.API_BASE.TEST.getUrl();

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    private HttpResponse<String> send(HttpRequest request){
        ConektaAuthenticator.getInstance();
        try {
            return HttpClient.newBuilder()
                    .authenticator(ConektaAuthenticator.getBasicAuthenticator())
                    .connectTimeout(Duration.ofSeconds(Constants.HTTP_CLIENT_TIMEOUT))
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new IOConektaRequestorException("Something went wrong with the request, check the syntax.", e.getCause());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new InterruptedConektaRequestorException("The request was interrupted, the Conekta-Api was unable to accept the request.", e.getCause());
        }
    }

    public HttpResponse<String> doRequest(ConektaObject conektaObject, String path, String method){
        HttpRequest.Builder builder = HttpRequest.newBuilder();
        String jsonBody = ConektaObjectMapper.getInstance().conektaObjectToString(conektaObject);
        switch (method) {
            case Constants.POST:
                builder = builder.POST(HttpRequest.BodyPublishers.ofString(jsonBody));
                break;
            case Constants.GET:
                builder = builder.GET();
                break;
            case Constants.PUT:
                builder = builder.PUT(HttpRequest.BodyPublishers.ofString(jsonBody));
                break;
            case Constants.DELETE:
                builder = builder.DELETE();
                break;
            default:
                throw new IOConektaRequestorException("Invalid method on Conekta-Api: " + method);
        }

        HttpRequest request = builder
                .uri(URI.create(environment + path))
                .setHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .setHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setHeader(Constants.USER_AGENT, Constants.API_NAME_VALUE + Constants.SLASH + Constants.LIB_VERSION)
                .build();
        return send(request);
    }
}
