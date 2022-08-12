package conekta.io.model.submodel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LineItem extends ConektaData {
    private String name;
    private BigDecimal unitPrice;
    private int quantity;
    private List<String> tags;
    //TODO REVISAR
    private Object metadata;
    private AntifraudInfo antifraudInfo;
}
