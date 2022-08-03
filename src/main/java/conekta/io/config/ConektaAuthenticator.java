package conekta.io.config;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ConektaAuthenticator {

    private static ConektaAuthenticator conektaAuthenticator = null;
    private static String username = "key_7yMxyxV1iNbxyaxPxi5zzQ";
    private static String password = "";

    private ConektaAuthenticator() {
    }

    public static void getInstance() {
        if (conektaAuthenticator == null) {
            conektaAuthenticator = new ConektaAuthenticator();
        }
    }

    public static void setCredentials(String username, String password) {
        ConektaAuthenticator.username = username;
        ConektaAuthenticator.password = password;
    }

    public static Authenticator getBasicAuthenticator() {
        return new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        };
    }
}
