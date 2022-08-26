package conekta.io.config;

public class Constants {

    public static final String SLASH = "/";
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String POST = "POST";
    public static final String API_BASE_TEST = "https://apipp.conekta.io/";
    public static final String API_BASE_PROD = "https://api.conekta.io/";
    public static final String NEXT = "?next=";
    public static final String EVENTS_PATH = "/events";
    public static final String CHARGES = "/charges";
    public static final String REFUNDS = "/refunds";
    public static final int HTTP_CLIENT_TIMEOUT = 15;
    public static final String PAYMENT_SOURCES = "/payment_sources";
    public static final String WEBHOOKS_PATH = "/webhooks";

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The default base URL to use when building requests to the Conekta API.
     */
    public enum API_BASE {
        LIVE(API_BASE_PROD),
        TEST(API_BASE_TEST);

        private final String url;

        API_BASE(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    /**
     * Version of the Conekta API to use.
     */
    public static final String API_VERSION = "2.1.1";

    /**
     * Locale to use when building requests to the Conekta API.
     */
    public static final String LOCALE = "es";

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

    /**
     * Content type header value.
     */
    public static final String APPLICATION_JSON_CHARSET_UTF_8 = "application/json; charset=utf-8";

    /**
     * Accept header value.
     */
    public static final String APPLICATION_VND_CONEKTA_V_2_0_0_JSON = "application/vnd.conekta-v2.0.0+json";
}
