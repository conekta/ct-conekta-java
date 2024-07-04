package com.conekta;

public class Utils {
    private static final String defaultBasePath = "http://localhost:3000";
    public static String getBasePath(){
        String basePath = System.getenv("BASE_PATH");
        if (basePath == null || basePath.isEmpty()) {
            return defaultBasePath;
        }
        return basePath;
    }

    public static String getProxyUri(){
        String proxyUri = System.getenv("PROXY_URI");
        if (proxyUri == null || proxyUri.isEmpty()) {
            return "http://localhost:9080";
        }
        return proxyUri;
    }
}
