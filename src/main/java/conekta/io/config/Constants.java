package conekta.io.config;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The default base URL to use when building requests to the Conekta API.
     */
    public static final String API_BASE = "https://apipp.conekta.io/";
    //TODO cambiar a produccion

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
