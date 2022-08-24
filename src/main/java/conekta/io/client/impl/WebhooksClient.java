package conekta.io.client.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import conekta.io.client.ConektaRequestor;
import conekta.io.client.ConektaResponse;
import conekta.io.config.ConektaObjectMapper;
import conekta.io.config.Constants;
import conekta.io.error.ConektaErrorResponse;
import conekta.io.model.PaginatedConektaObject;
import conekta.io.model.impl.Webhook;

import java.net.http.HttpResponse;

public class WebhooksClient extends ConektaRequestor {
    public ConektaResponse<Webhook> createWebhook(Webhook webhook) {
        HttpResponse<String> webhookResponse = doRequest(webhook, Constants.WEBHOOKS_PATH, Constants.POST);
        return ConektaResponse.<Webhook>builder()
                .response(webhookResponse)
                .statusCode(webhookResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), Webhook.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<Webhook> retrieveWebhook(String webhookId) {
        HttpResponse<String> webhookResponse = doRequest(null, Constants.WEBHOOKS_PATH + Constants.SLASH + webhookId, Constants.GET);
        return ConektaResponse.<Webhook>builder()
                .response(webhookResponse)
                .statusCode(webhookResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), Webhook.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<PaginatedConektaObject<Webhook>> getWebhooks(String next) {
        HttpResponse<String> webhooksResponse = doRequest(null, Constants.WEBHOOKS_PATH + (next != null ? Constants.NEXT + next : ""), Constants.GET);
        return ConektaResponse.<PaginatedConektaObject<Webhook>>builder()
                .response(webhooksResponse)
                .statusCode(webhooksResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(webhooksResponse.body(), new TypeReference<>() {
                }))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(webhooksResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<Webhook> updateWebhook(String webhookId, Webhook webhook) {
        HttpResponse<String> webhookResponse = doRequest(webhook, Constants.WEBHOOKS_PATH + Constants.SLASH + webhookId, Constants.PUT);
        return ConektaResponse.<Webhook>builder()
                .response(webhookResponse)
                .statusCode(webhookResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), Webhook.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), ConektaErrorResponse.class))
                .build();
    }

    public ConektaResponse<Webhook> deleteWebhook(String webhookId) {
        HttpResponse<String> webhookResponse = doRequest(null, Constants.WEBHOOKS_PATH + Constants.SLASH + webhookId, Constants.DELETE);
        return ConektaResponse.<Webhook>builder()
                .response(webhookResponse)
                .statusCode(webhookResponse.statusCode())
                .data(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), Webhook.class))
                .error(ConektaObjectMapper.getInstance().stringJsonToObject(webhookResponse.body(), ConektaErrorResponse.class))
                .build();
    }
}
