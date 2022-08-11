package conekta.io.model;

import lombok.Data;

import java.util.List;

    @Data
    public class ErrorResponse {

        private List<ErrorMessages> details;
        private String object;
        private String type;
        private String logId;

        @Data
        private static class ErrorMessages {

            private String debugMessage;
            private String message;
            private String code;

        }
    }
