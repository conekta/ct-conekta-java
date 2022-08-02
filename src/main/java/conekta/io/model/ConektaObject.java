package conekta.io.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public abstract class ConektaObject {

    private String id;
    private String object;

    public String parseToString() {
        return this.toString();
    }
}
