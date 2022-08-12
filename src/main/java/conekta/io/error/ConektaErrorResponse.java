package conekta.io.error;

import lombok.Data;

import java.util.List;

@Data
public class ConektaErrorResponse {

    private String object;
    private String type;
    private String message;
    private String messageToPurchaser;
    private String param;
    private String code;
    private String validationError;
    private String logId;
    private List<ConektaError> details;

}
