package conekta.io;

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
}
