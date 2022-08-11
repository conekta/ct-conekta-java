package conekta.io.client;

import conekta.io.error.ConektaErrorResponse;
import lombok.Builder;
import lombok.Data;

import java.net.http.HttpResponse;

@Data
@Builder
public class ConektaResponse<T> {

    private HttpResponse<String> response;
    private int statusCode;
    private T data;
    private ConektaErrorResponse error;

}
