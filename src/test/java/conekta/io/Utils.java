package conekta.io;

import conekta.io.config.Constants;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    public static String readFile(String path, Charset encoding) throws IOException, URISyntaxException {
        byte[] encoded = Files.readAllBytes(Paths.get(Utils.class.getClassLoader().getResource(path).toURI()));
        return new String(encoded, encoding);
    }

    public static String readFile(String path) throws IOException, URISyntaxException {
        return readFile(path, Charset.defaultCharset());
    }

    public static void buildMockServer(MockWebServer mockWebServer, String responseBodyJson, int statusCode) {
        mockWebServer.enqueue(new MockResponse()
                .addHeader(Constants.CONTENT_TYPE, Constants.APPLICATION_JSON_CHARSET_UTF_8)
                .addHeader(Constants.ACCEPT, Constants.APPLICATION_VND_CONEKTA_V_2_0_0_JSON)
                .setBody(responseBodyJson)
                .setResponseCode(statusCode));
    }

}
