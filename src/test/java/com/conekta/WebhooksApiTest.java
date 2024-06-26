/*
 * Conekta API
 * Conekta sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@conekta.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.conekta;

import com.conekta.*;
import com.conekta.auth.*;
import com.conekta.model.Error;
import com.conekta.model.GetWebhooksResponse;
import com.conekta.model.WebhookRequest;
import com.conekta.model.WebhookResponse;
import com.conekta.model.WebhookUpdateRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Create Webhook
     *
     * What we do at Conekta translates into events. For example, an event of interest to us occurs at the time a payment is successfully processed. At that moment we will be interested in doing several things: Send an email to the buyer, generate an invoice, start the process of shipping the product, etc.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        WebhookRequest webhookRequest = new WebhookRequest();
        webhookRequest.setUrl("https://url.foo.io");
        String acceptLanguage = "es";
        WebhookResponse response = api.createWebhook(webhookRequest, acceptLanguage);
        Assertions.assertNotNull(response);
    }

    /**
     * Delete Webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        String id = "641b1d5662d7e00001eaa46b";
        String acceptLanguage = "es";
        WebhookResponse response = api.deleteWebhook(id, acceptLanguage);
        Assertions.assertNotNull(response);
    }

    /**
     * Get Webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        String id = "641b1d5662d7e00001eaa46b";
        String acceptLanguage = "es";
        WebhookResponse response = api.getWebhook(id, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Get List of Webhooks
     *
     * Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        String acceptLanguage = "es";
        Integer limit = 20;
        GetWebhooksResponse response = api.getWebhooks(acceptLanguage, null, limit, null, null, null, null);
        Assertions.assertNotNull(response);
    }

    /**
     * Test Webhook
     *
     * Send a webhook.ping event
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testWebhookTest() throws ApiException {
        String id = "641b1d5662d7e00001eaa46b";
        String acceptLanguage = "es";
        WebhookResponse response = api.testWebhook(id, acceptLanguage);
        Assertions.assertNotNull(response);
    }

    /**
     * Update Webhook
     *
     * updates an existing webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        String id = "es";
        WebhookUpdateRequest webhookUpdateRequest = new WebhookUpdateRequest();
        webhookUpdateRequest.setUrl("https://api.foo.com");
        String acceptLanguage = "es";
        WebhookResponse response = api.updateWebhook(id, webhookUpdateRequest, acceptLanguage, null);
        Assertions.assertNotNull(response);
    }

}
