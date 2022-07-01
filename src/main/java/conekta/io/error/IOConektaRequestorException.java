package conekta.io.error;

import java.io.IOException;

public class IOConektaRequestorException extends RuntimeException {
    public IOConektaRequestorException() {
    }

    public IOConektaRequestorException(String message) {
        super(message);
    }

    public IOConektaRequestorException(String message, Throwable cause) {
        super(message, cause);
    }

    public IOConektaRequestorException(Throwable cause) {
        super(cause);
    }

    public IOConektaRequestorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public IOConektaRequestorException(IOException e) {
    }
}
