package conekta.io.model.submodel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class LineItem extends ConektaData {
    public String name;
    public BigDecimal unitPrice;
    public int quantity;
    public List<String> tags;
    //TODO REVISAR
    public Object metadata;
    public AntifraudInfo antifraudInfo;
}
