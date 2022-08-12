package conekta.io.error;

public class ConektaObjectMapperException extends RuntimeException {
    public ConektaObjectMapperException() {
    }

    public ConektaObjectMapperException(String message) {
        super(message);
    }

    public ConektaObjectMapperException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConektaObjectMapperException(Throwable cause) {
        super(cause);
    }

    public ConektaObjectMapperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
