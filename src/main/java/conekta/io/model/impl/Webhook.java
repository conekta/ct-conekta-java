package conekta.io.model.impl;

import conekta.io.model.ConektaObject;
import lombok.Data;

import java.util.List;

@Data

public class Webhook extends ConektaObject {

    private String url;
    private String status;
    private List<String> subscribedEvents;
    private Boolean synchronous;
    private Boolean productionEnabled;
    private Boolean developmentEnabled;

}
