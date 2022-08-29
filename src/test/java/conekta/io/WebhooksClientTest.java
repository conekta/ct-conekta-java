package conekta.io;

import conekta.io.client.ConektaResponse;
import conekta.io.client.impl.WebhooksClient;
import conekta.io.config.ConektaAuthenticator;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Webhook;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

class WebhooksClientTest {

    private MockWebServer mockWebServer;
    private WebhooksClient webhooksClient;

    @BeforeEach
    void generateAuthenticator() {
        this.mockWebServer = new MockWebServer();
        this.webhooksClient = new WebhooksClient();
        webhooksClient.setEnvironment(mockWebServer.url("/").toString());
        ConektaAuthenticator.getInstance();
        ConektaAuthenticator.setCredentials("USER", "");
    }

    @Test
    void createWebhook() throws IOException, URISyntaxException {
        // Arrange
        String webhookJson = Utils.readFile("webhooks/webhook.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);

        Utils.buildMockServer(this.mockWebServer, webhookJson, 201);

        // Act
        ConektaResponse<Webhook> webhookConektaResponse = webhooksClient.createWebhook(webhook);
        // Assert
        Assertions.assertEquals(webhookConektaResponse.getData(), webhook);
        Assertions.assertEquals(201, webhookConektaResponse.getStatusCode());
    }

    @Test
    void retrieveWebhook() throws IOException, URISyntaxException {
        // Arrange
        String webhookJson = Utils.readFile("webhooks/webhook.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);

        Utils.buildMockServer(this.mockWebServer, webhookJson, 200);

        // Act
        ConektaResponse<Webhook> webhookConektaResponse = webhooksClient.retrieveWebhook(webhook.getId());
        // Assert
        Assertions.assertEquals(webhookConektaResponse.getData(), webhook);
        Assertions.assertEquals(200, webhookConektaResponse.getStatusCode());
    }

    @Test
    void getWebhooks() throws IOException, URISyntaxException {
        // Arrange
        String webhookJson = Utils.readFile("webhooks/webhook.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);
        PaginatedConektaObject<Webhook> paginatedConektaObject = new PaginatedConektaObject<>();
        paginatedConektaObject.setData(List.of(webhook));
        String s = ConektaObjectMapper.getInstance().conektaObjectToString(paginatedConektaObject);

        Utils.buildMockServer(this.mockWebServer, s, 200);

        // Act
        ConektaResponse<PaginatedConektaObject<Webhook>> webhooksConektaResponse = webhooksClient.getWebhooks(null);
        // Assert
        Assertions.assertEquals(webhooksConektaResponse.getData(), paginatedConektaObject);
        Assertions.assertEquals(200, webhooksConektaResponse.getStatusCode());
    }

    @Test
    void updateWebhook() throws IOException, URISyntaxException {
        // Arrange
        String webhookJson = Utils.readFile("webhooks/webhook.json");
        String webhookJsonUpdated = Utils.readFile("webhooks/webhookUpdated.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);
        Webhook webhookUpdated = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJsonUpdated, Webhook.class);

        Utils.buildMockServer(this.mockWebServer, webhookJsonUpdated, 200);

        // Act
        ConektaResponse<Webhook> webhookConektaResponse = webhooksClient.updateWebhook(webhook.getId(), webhook);
        // Assert
        Assertions.assertEquals(webhookConektaResponse.getData(), webhookUpdated);
        Assertions.assertNotEquals(webhookConektaResponse.getData(), webhook);
        Assertions.assertEquals(200, webhookConektaResponse.getStatusCode());
    }

    @Test
    void deleteWebhook() throws IOException, URISyntaxException {
        // Arrange
        String webhookJson = Utils.readFile("webhooks/webhook.json");
        String webhookJsonDeleted = Utils.readFile("webhooks/webhookDeleted.json");
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJson, Webhook.class);
        webhook.setDeleted(true);

        Utils.buildMockServer(this.mockWebServer, webhookJsonDeleted, 200);

        // Act
        ConektaResponse<Webhook> webhookConektaResponse = webhooksClient.deleteWebhook(webhook.getId());
        // Assert
        Assertions.assertEquals(webhookConektaResponse.getData(), webhook);
        Assertions.assertEquals(200, webhookConektaResponse.getStatusCode());
    }

    @Test
    void createWithError() throws IOException, URISyntaxException {
        // Arrange
        String webhookJsonError = Utils.readFile("webhooks/webhookError.json");
        ConektaErrorResponse error = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJsonError, ConektaErrorResponse.class);
        Webhook webhook = ConektaObjectMapper.getInstance().stringJsonToObject(webhookJsonError, Webhook.class);

        Utils.buildMockServer(this.mockWebServer, webhookJsonError, 404);

        // Act
        ConektaResponse<Webhook> webhookConektaResponse = webhooksClient.createWebhook(webhook);
        // Assert
        Assertions.assertEquals(webhookConektaResponse.getError(), error);
        Assertions.assertEquals(404, webhookConektaResponse.getStatusCode());
    }
}