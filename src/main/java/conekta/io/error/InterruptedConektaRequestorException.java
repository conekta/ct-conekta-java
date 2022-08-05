package conekta.io.error;

public class InterruptedConektaRequestorException extends RuntimeException {

    public InterruptedConektaRequestorException() {
    }

    public InterruptedConektaRequestorException(String message) {
        super(message);
    }

    public InterruptedConektaRequestorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InterruptedConektaRequestorException(Throwable cause) {
        super(cause);
    }

    public InterruptedConektaRequestorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
