package conekta.io.model;

import lombok.Data;
import java.util.*;

@Data
public class PaginatedConektaObject {

    private List<ConektaObject> data;
    private boolean hasMore;
    private int total;
    private String object;

}