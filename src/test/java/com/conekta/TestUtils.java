package com.conekta;

import com.conekta.auth.HttpBearerAuth;

final class TestUtils {

    private TestUtils() {
    }

    static ApiClient apiClient() {
        ApiClient client = new ApiClient();
        String basePath = System.getenv("BASE_PATH");
        client.setBasePath(basePath != null && !basePath.isEmpty() ? basePath : "http://localhost:3000");
        HttpBearerAuth bearerAuth = (HttpBearerAuth) client.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("test_token");
        return client;
    }
}
