package conekta.io.model.submodel;

import conekta.io.model.ConektaObject;
import lombok.Data;
import java.util.*;

@Data
public class PaginatedConektaObject {

    private List<ConektaObject> data;
    private boolean hasMore;
    private int total;
    private String object;

}