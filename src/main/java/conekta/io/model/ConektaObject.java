package conekta.io.model;

import lombok.Data;

public abstract class ConektaObject {

    private String id;
    private String object;

    public String parseToString() {
        return this.toString();
    }
}
