package conekta.io.error;

import lombok.Data;

@Data
public class ConektaError {

    private String debugMessage;
    private String message;
    private String param;
    private String code;

}
