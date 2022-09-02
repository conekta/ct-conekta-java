package conekta.io.model.submodel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LineItem extends ConektaData {
    private String name;
    private BigDecimal unitPrice;
    private Integer quantity;
    private List<String> tags;
    private Object metadata;
    private AntifraudInfo antifraudInfo;
}
