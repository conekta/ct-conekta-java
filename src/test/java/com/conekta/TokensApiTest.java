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
import com.conekta.model.Token;
import com.conekta.model.TokenCard;
import com.conekta.model.TokenResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokensApi
 */
public class TokensApiTest {

    private final TokensApi api = new TokensApi(new ApiClient().setBasePath(Utils.getBasePath()));

    /**
     * Create Token
     *
     * Generate a payment token, to associate it with a card
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTokenTest() throws ApiException {
        Token token = new Token();
        TokenCard tokenCard = new TokenCard();
        tokenCard.setNumber("5475040095304607");
        tokenCard.setCvc("123");
        tokenCard.setName("Foo Foo");
        tokenCard.setExpMonth("10");
        tokenCard.setExpYear("2027");
        token.setCard(tokenCard);
        String acceptLanguage = "es";
        TokenResponse response = api.createToken(token, acceptLanguage);
        Assertions.assertNotNull(response);
    }

}
