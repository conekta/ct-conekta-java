package conekta.io.config;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ConektaAuthenticator {
    private static String username;
    private static String password;

    private ConektaAuthenticator() {
        // The only wait to create user and password is to set manually before using the library.
    }

    public static Authenticator getBasicAuthenticator(){
        return new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(getUsername(), getPassword().toCharArray());
            }
        };
    }

    public static void setUsername(String username) {
        ConektaAuthenticator.username = username;
    }

    public static void setPassword(String password) {
        ConektaAuthenticator.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
