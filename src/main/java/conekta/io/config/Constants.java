package conekta.io.config;

import org.json.JSONObject;
public class Constants {

    public static final String SLASH = "/";
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String POST = "POST";
    public static final String API_BASE_PROD = "https://api.conekta.io/";
    public static final String NEXT = "?next=";
    public static final String EVENTS_PATH = "/events";
    public static final String CHARGES = "/charges";
    public static final String REFUNDS = "/refunds";
    public static final int HTTP_CLIENT_TIMEOUT = 15;
    public static final String PAYMENT_SOURCES = "/payment_sources";
    public static final String WEBHOOKS_PATH = "/webhooks";
    public static final String LIB_NAME = "ct-conekta-java";
    public static final String USER_AGENT = "User-Agent";


    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Version of the lib to use.
     */
    public static final String LIB_VERSION = "3.0.3";

    /**
     * The customer path.
     */
    public static final String CUSTOMERS_PATH = "customers";

    /**
     * The orders' path.
     */
    public static final String ORDERS_PATH = "orders";

    /**
     * Content type header.
     */
    public static final String CONTENT_TYPE = "Content-Type";

    /**
     * Accept header.
     */
    public static final String ACCEPT = "Accept";

    public static final String CONEKTA_CLIENT_USER_AGENT  = "X-Conekta-Client-User-Agent";

    /**
     * Content type header value.
     */
    public static final String APPLICATION_JSON_CHARSET_UTF_8 = "application/json; charset=utf-8";

    /**
     * Accept header value.
     */
    public static final String APPLICATION_VND_CONEKTA_V_2_0_0_JSON = "application/vnd.conekta-v2.0.0+json";

    public static final String CONEKTA_CLIENT_USER_AGENT_VALUE= getUserAgent().toString();

    private static JSONObject getUserAgent()  {
        JSONObject userAgent = new JSONObject();
        userAgent.put("bindings_version", LIB_VERSION);
        userAgent.put("lang", "java");
        userAgent.put("lang_version", System.getProperty("java.version"));
        userAgent.put("publisher", "conekta");
        return userAgent;
    }
}